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
	int[][] hops;
	boolean enable = false;

	static class Tuple {
		int h, w, hop;

		Tuple(int h, int w, int hop) {
			this.h = h;
			this.w = w;
			this.hop = hop;
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
		hops = new int[H][W];
		for (int i = 0; i < H; ++i) {
			Arrays.fill(hops[i], Integer.MAX_VALUE / 2);
		}
		hops[cH][cW] = 0;
	}

	Set<Tuple> getNexts(int ch, int cw, int chop) {
		Set<Tuple> set = new HashSet<>();
		for (int h = Math.max(0, ch - 1); h <= Math.min(H - 1, ch + 1); h += 2) {
			if (map[h][cw]) {
				if (chop < hops[h][cw]) {
					set.add(new Tuple(h, cw, chop));
				}
			}
		}
		for (int w = Math.max(0, cw - 1); w <= Math.min(W - 1, cw + 1); w += 2) {
			if (map[ch][w]) {
				if (chop < hops[ch][w]) {
					set.add(new Tuple(ch, w, chop));
				}
			}
		}

		return set;
	}

	Set<Tuple> getWarps(int ch, int cw, int chop) {
		Set<Tuple> set = new HashSet<>();
		for (int h = Math.max(0, ch - 2); h <= Math.min(H - 1, ch + 2); ++h) {
			for (int w = Math.max(0, cw - 2); w <= Math.min(W - 1, cw + 2); ++w) {
				if (map[h][w]) {
					if (chop + 1 < hops[h][w]) {
						set.add(new Tuple(h, w, chop + 1));
					}
				}
			}
		}
		return set;
	}

	void calc() {
		Queue<Tuple> que = new PriorityQueue<>(new Comparator<Tuple>() {
			@Override
			public int compare(Tuple o1, Tuple o2) {
				return Integer.compare(o1.hop, o2.hop);
			}
		});
		que.addAll(getNexts(cH, cW, 0));
		que.addAll(getWarps(cH, cW, 0));
		while (!que.isEmpty()) {
			Tuple next = que.poll();
			hops[next.h][next.w] = next.hop;
			if (next.h == dH && next.w == dW) {
				enable = true;
				break;
			}
			Set<Tuple> nexts = getNexts(next.h, next.w, next.hop);
			que.addAll(nexts);
			if (nexts.size() < 4) {
				que.addAll(getWarps(next.h, next.w, next.hop));
			}
		}
	}

	void showResult() {
		if (enable) {
			System.out.println(hops[dH][dW]);
		} else {
			System.out.println("-1");
		}
	}
}