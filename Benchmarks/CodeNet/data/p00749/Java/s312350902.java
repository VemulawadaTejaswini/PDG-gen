import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static final int[][] MOVE_DIRS = { { 1, 0 }, { -1, 0 }, { 0, 1 },{ 0, -1 } };
	public static final int[][] MOVE_UNDER = { { 1, 0 }, { -1, 0 }, { 0, 1 } };

	public static void check_areas(int x, int y, final int w, final int h,
			int color, int[][] blocks, int[][] new_blocks, boolean[][] checked,
			final int id, ArrayList<Integer> sizes, ArrayList<Double> dists,
			ArrayList<Integer> mins, ArrayList<Integer> maxs) {
		LinkedList<Integer> x_queue = new LinkedList<Integer>();
		LinkedList<Integer> y_queue = new LinkedList<Integer>();

		if (blocks[y][x] != color || checked[y][x]) {
			return;
		} else {
			checked[y][x] = true;
		}
		x_queue.add(x);
		y_queue.add(y);

		int reached = 0;
		double dist_sum = 0;
		int min_y = Integer.MAX_VALUE;
		int min_x = Integer.MAX_VALUE;
		int max_x = Integer.MIN_VALUE;
		while (!x_queue.isEmpty()) {
			final int cx = x_queue.poll();
			final int cy = y_queue.poll();

			reached++;
			if(cy == 0 || (blocks[cy][cx] != blocks[cy - 1][cx] && blocks[cy - 1][cx] >= 0)){
				if(min_y > y){
					min_y = cy;
					min_x = cx;
					max_x = cx;
				}else{
					min_x = Math.min(min_x, cx);
					max_x = Math.max(max_x, cx);
				}
			}
			
			new_blocks[cy][cx] = id;
			dist_sum += cx + 0.5;

			for (final int[] move : MOVE_DIRS) {
				final int nx = cx + move[0];
				final int ny = cy + move[1];

				if (nx < 0 || nx >= w || ny < 0 || ny >= h) {
					continue;
				} else if (blocks[ny][nx] != color) {
					continue;
				} else if (checked[ny][nx]) {
					continue;
				} else {
					checked[ny][nx] = true;
					x_queue.add(nx);
					y_queue.add(ny);
				}
			}
		}

		sizes.add(reached);
		dists.add(dist_sum);
		mins.add(min_x);
		maxs.add(max_x);
	}

	public static ArrayList<HashSet<Integer>> get_nexts(int[][] blocks,
			final int w, final int h, final int size) {
		ArrayList<HashSet<Integer>> adj_list = new ArrayList<HashSet<Integer>>();
		for (int i = 0; i < size; i++) {
			adj_list.add(new HashSet<Integer>());
		}

		int sx = 0, sy = 0;
		for (int i = 0; i < w; i++) {
			if (blocks[0][i] >= 0) {
				sx = i;
				break;
			}
		}

		boolean[][] visited = new boolean[h][w];
		LinkedList<Integer> x_queue = new LinkedList<Integer>();
		LinkedList<Integer> y_queue = new LinkedList<Integer>();
		LinkedList<Integer> prev_queue = new LinkedList<Integer>();

		x_queue.add(sx);
		y_queue.add(sy);
		prev_queue.add(-1);
		visited[sy][sx] = true;

		while (!x_queue.isEmpty()) {
			final int cx = x_queue.poll();
			final int cy = y_queue.poll();
			final int prev = prev_queue.poll();

			if (prev >= 0 && prev != blocks[cy][cx]) {
				adj_list.get(prev).add(blocks[cy][cx]);
			}

			for (final int[] move : MOVE_UNDER) {
				final int nx = cx + move[0];
				final int ny = cy + move[1];

				if (nx < 0 || nx >= w || ny < 0 || ny >= h) {
					continue;
				} else if (blocks[ny][nx] < 0) {
					continue;
				} else if (visited[ny][nx]) {
					continue;
				} else {
					visited[ny][nx] = true;
					x_queue.add(nx);
					y_queue.add(ny);
					prev_queue.add(blocks[cy][cx]);
				}
			}
		}

		return adj_list;
	}

	public static double sum_dists(boolean NG, int id,
			ArrayList<HashSet<Integer>> adj, ArrayList<Double> dists) {
		double sum = NG ? 0 : dists.get(id);
		for (int next : adj.get(id)) {
			sum += sum_dists(false, next, adj, dists);
		}
		return sum;
	}

	public static int sum_child_area(boolean NG, int id,
			ArrayList<HashSet<Integer>> adj, ArrayList<Integer> size) {
		int sum = NG ? 0 : size.get(id);
		for (int next : adj.get(id)) {
			sum += sum_child_area(false, next, adj, size);
		}
		return sum;
	}

	public static int get_child_min(boolean NG, int id,
			ArrayList<HashSet<Integer>> adj, ArrayList<Integer> min_x) {
		int min = NG ? Integer.MAX_VALUE : min_x.get(id);
		for (int next : adj.get(id)) {
			min = Math.min(min, get_child_min(false, next, adj, min_x));
		}
		return min;
	}

	public static int get_child_max(boolean NG, int id,
			ArrayList<HashSet<Integer>> adj, ArrayList<Integer> max_x) {
		int max = NG ? Integer.MIN_VALUE : max_x.get(id);
		for (int next : adj.get(id)) {
			max = Math.max(max, get_child_max(false, next, adj, max_x));
		}
		return max;
	}

	public static boolean dfs(int id, ArrayList<HashSet<Integer>> adj,
			ArrayList<Integer> size, ArrayList<Double> dists,
			ArrayList<Integer> max_x, ArrayList<Integer> min_x) {
		for (int next : adj.get(id)) {
			if (!dfs(next, adj, size, dists, max_x, min_x)) {
				return false;
			}
		}

		//final int child_min = get_child_min(true, id, adj, min_x);
		//final int child_max = get_child_max(true, id, adj, max_x) + 1;
		final int child_size = sum_child_area(false, id, adj, size);
		final double child_dists = sum_dists(false, id, adj, dists);

		final int this_min = min_x.get(id);
		final int this_max = max_x.get(id) + 1;
		
		final double S = child_dists / child_size;
		//System.out.println(child_dists + "/" + child_size + " : " + this_min + " " + S + " " + this_max);

		if (this_min < S && S < this_max) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int w = sc.nextInt();
			final int h = sc.nextInt();

			if(w == 0 && h == 0){
				break;
			}
			
			int[][] blocks = new int[h][w];
			int[][] new_blocks = new int[h][w];
			for (int i = 0; i < h; i++) {
				final char[] inputs = sc.next().toCharArray();

				for (int j = 0; j < w; j++) {
					blocks[h - i - 1][j] = inputs[j] == '.' ? -1 : Character
							.getNumericValue(inputs[j]);
				}
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					new_blocks[i][j] = -1;
				}
			}

			int cnt = 0;
			ArrayList<Integer> sizes = new ArrayList<Integer>();
			ArrayList<Integer> min_x = new ArrayList<Integer>();
			ArrayList<Integer> max_x = new ArrayList<Integer>();
			ArrayList<Double> dists = new ArrayList<Double>();

			boolean[][] checked = new boolean[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (blocks[i][j] < 0) {
						continue;
					}
					if (checked[i][j]) {
						continue;
					}

					check_areas(j, i, w, h, blocks[i][j], blocks, new_blocks,
							checked, cnt, sizes, dists, min_x, max_x);
					cnt++;
				}
			}

			ArrayList<HashSet<Integer>> adj = get_nexts(new_blocks, w, h, cnt);

			/*
			 * for(int i = 0; i < h; i++){ for(int j = 0; j < w; j++){
			 * System.out.printf("%s", new_blocks[i][j] < 0 ? " " :
			 * new_blocks[i][j] + ""); } System.out.println(); } for(int i = 0;
			 * i < cnt; i++){ System.out.println(max_x.get(i) + " " +
			 * min_x.get(i) + " " + sizes.get(i)); } System.out.println(min_x +
			 * " " + max_x + " " + sizes);
			 */
			
			System.out.println(dfs(0, adj, sizes, dists, max_x, min_x) ? "STABLE" : "UNSTABLE");
		}
	}
}