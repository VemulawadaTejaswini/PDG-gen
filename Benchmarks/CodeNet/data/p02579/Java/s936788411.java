import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int H, W;
	int cH, cW, dH, dW;
	List<String> lines;
	boolean[][] map;
	boolean[][] touched;
	boolean[][] warpTouched;
	int[][] dists;
	boolean enable = false;

	static class Next {
		int h, w, dist;

		Next(int h, int w, int dist) {
			this.h = h;
			this.w = w;
			this.dist = dist;
		}
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		H = Integer.parseInt(tokens[0]);
		W = Integer.parseInt(tokens[1]);
		tokens = in.readLine().split(" ");
		cH = Integer.parseInt(tokens[0]) - 1;
		cW = Integer.parseInt(tokens[1]) - 1;
		tokens = in.readLine().split(" ");
		dH = Integer.parseInt(tokens[0]) - 1;
		dW = Integer.parseInt(tokens[1]) - 1;
		lines = new ArrayList<>(H);
		for (int i = 0; i < H; ++i) {
			lines.add(in.readLine());
		}
		map = new boolean[H][W];
		for (int i = 0; i < H; ++i) {
			String line = lines.get(i);
			for (int j = 0; j < W; ++j) {
				map[i][j] = (line.charAt(j) == '.') ? true : false;
			}
		}
		touched = new boolean[H][W];
		for (int i = 0; i < H; ++i) {
			Arrays.fill(touched[i], false);
		}
		
		dists = new int[H][W];
		for (int i = 0; i < H; ++i) {
			Arrays.fill(dists[i], Integer.MAX_VALUE / 2);
		}

		dists[cH][cW] = 0;
		touched[cH][cW] = true;

	}

	Set<Next> getNexts(int h, int w, int cdist) {
		Set<Next> set = new HashSet<>();
		if (h - 1 >= 0) {
			if (map[h - 1][w] && !touched[h - 1][w]) {
				set.add(new Next(h - 1, w, cdist));
				touched[h - 1][w] = true;
			}
		}
		if (h + 1 < H) {
			if (map[h + 1][w] && !touched[h + 1][w]) {
				set.add(new Next(h + 1, w, cdist));
				touched[h + 1][w] = true;
			}
		}
		if (w - 1 >= 0) {
			if (map[h][w - 1] && !touched[h][w - 1]) {
				set.add(new Next(h, w - 1, cdist));
				touched[h][w - 1] = true;
			}
		}
		if (w + 1 < W) {
			if (map[h][w + 1] && !touched[h][w + 1]) {
				set.add(new Next(h, w + 1, cdist));
				touched[h][w + 1] = true;
			}
		}
		return set;
	}

	Set<Next> getWarps(int h, int w, int cdist) {
		Set<Next> set = new HashSet<>();
		if (h - 2 >= 0) {
			for (int i = Math.max(0, w - 2); i <= Math.min(W - 1, w + 2); ++i) {
				if (map[h - 2][i] && !touched[h - 2][i]) {
					set.add(new Next(h - 2, i, cdist + 1));
					// touched[h - 2][i] = true;
				}
			}
		}
		if (h - 1 >= 0) {
			for (int i = Math.max(0, w - 2); i <= Math.min(W - 1, w + 2); ++i) {
				if (map[h - 1][i] && !touched[h - 1][i]) {
					if (i != w) {
						set.add(new Next(h - 1, i, cdist + 1));
						// touched[h - 1][i] = true;
					}
				}
			}
		}
		{
			if (w - 2 >= 0) {
				if (map[h][w - 2] && !touched[h][w - 2]) {
					set.add(new Next(h, w - 2, cdist + 1));
					// touched[h][w - 2] = true;
				}
			}
			if (w + 2 < W) {
				if (map[h][w + 2] && !touched[h][w + 2]) {
					set.add(new Next(h, w + 2, cdist + 1));
					// touched[h][w + 2] = true;
				}
			}
		}
		if (h + 1 < H) {
			for (int i = Math.max(0, w - 2); i <= Math.min(W - 1, w + 2); ++i) {
				if (map[h + 1][i] && !touched[h + 1][i]) {
					if (i != w) {
						set.add(new Next(h + 1, i, cdist + 1));
						// touched[h + 1][i] = true;
					}
				}
			}
		}
		if (h + 2 < H) {
			for (int i = Math.max(0, w - 2); i <= Math.min(W - 1, w + 2); ++i) {
				if (map[h + 2][i] && !touched[h + 2][i]) {
					set.add(new Next(h + 2, i, cdist + 1));
					// touched[h + 2][i] = true;
				}
			}
		}
		return set;
	}

	void calc() {
		Deque<Next> que = new LinkedList<>();
		que.addAll(getNexts(cH, cW, 0));
		que.addAll(getWarps(cH, cW, 0));
		while (!que.isEmpty()) {
			Next next = que.poll();
			dists[next.h][next.w] = next.dist;
			// System.out.println(" " + next.h + " " + next.w + " " + next.dist);
			if (next.h == dH && next.w == dW) {
				enable = true;
				break;
			}
			for (Next n : getNexts(next.h, next.w, next.dist)) {
				que.addFirst(n);

			}
			for (Next w : getWarps(next.h, next.w, next.dist)) {
				que.addLast(w);
			}
		}
	}

	void show() {
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				System.out.print(dists[i][j] + " ");
			}
			System.out.println("");
		}
	}

	void showResult() {
		if (enable) {
			System.out.println(dists[dH][dW]);
		} else {
			System.out.println("-1");
		}
		// show();
	}
}