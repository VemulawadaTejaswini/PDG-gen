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
	Tuple[] nodes;
	boolean enable = false;

	static class Tuple {
		int id, h, w, hop;
		Set<Integer> conns;
		Set<Integer> warps;

		Tuple(int id, int h, int w, int hop) {
			this.id = id;
			this.h = h;
			this.w = w;
			this.hop = hop;
			this.conns = new HashSet<>();
			this.warps = new HashSet<>();
		}
	}

	static class Next {
		int h, w, dist;

		Next(int h, int w, int dist) {
			this.h = h;
			this.w = w;
			this.dist = dist;
		}
	}

	void addConns() {
		for (int h = 0; h < H; ++h) {
			for (int w = 0; w < W; ++w) {
				int i = h * W + w;
				if (map[h][w]) {
					if (w + 1 < W) {
						if (map[h][w + 1]) {
							int conn = h * W + (w + 1);
							nodes[i].conns.add(conn);
						}
					}
					if (w - 1 >= 0) {
						if (map[h][w - 1]) {
							int conn = h * W + (w - 1);
							nodes[i].conns.add(conn);
						}
					}
					if (h + 1 < H) {
						if (map[h + 1][w]) {
							int conn = (h + 1) * W + w;
							nodes[i].conns.add(conn);
						}
					}
					if (h - 1 >= 0) {
						if (map[h - 1][w]) {
							int conn = (h - 1) * W + w;
							nodes[i].conns.add(conn);
						}
					}
				}
			}
		}
	}

	void addWarps(int hDiff, int wDiff) {
		for (int h = 0; h < H; ++h) {
			for (int w = 0; w < W; ++w) {
				int i = h * W + w;
				if (map[h][w]) {
					int wH = h + hDiff;
					int wW = w + wDiff;
					if (wH >= 0 && wH < H) {
						if (wW >= 0 && wW < W) {
							if (map[wH][wW]) {
								int warp = wH * W + wW;
								nodes[i].warps.add(warp);
							}
						}
					}
				}
			}
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

		nodes = new Tuple[H * W];
		for (int h = 0; h < H; ++h) {
			for (int w = 0; w < W; ++w) {
				nodes[h * W + w] = new Tuple(h * W + w, h, w, Integer.MAX_VALUE / 2);
			}
		}

		addConns();
		addWarps(-2, -2);
		addWarps(-2, -1);
		addWarps(-2, 0);
		addWarps(-2, 1);
		addWarps(-2, 2);
		addWarps(-1, -2);
		addWarps(-1, -1);
		addWarps(-1, 1);
		addWarps(-1, 2);
		addWarps(0, -2);
		addWarps(0, 2);
		addWarps(1, -2);
		addWarps(1, -1);
		addWarps(1, 1);
		addWarps(1, 2);
		addWarps(2, -2);
		addWarps(2, -1);
		addWarps(2, 0);
		addWarps(2, 1);
		addWarps(2, 2);
		nodes[cH * W + cW].hop = 0;

	}

	Set<Next> getNexts(int h, int w, int cdist) {
		Set<Next> set = new HashSet<>();
		for (Integer next : nodes[h * W + w].conns) {
			int n = next;
			int nh = n / W;
			int nw = n % W;
			set.add(new Next(nh, nw, cdist));
		}
		Set<Integer> nexts = new HashSet<>();
		nexts.addAll(nodes[h * W + w].conns);
		int key = h * W + w;
		for (Integer next : nexts) {
			nodes[next].conns.remove(key);
		}
		nodes[key].conns.clear();

		return set;
	}

	Set<Next> getWarps(int h, int w, int cdist) {
		Set<Next> set = new HashSet<>();
		for (Integer warp : nodes[h * W + w].warps) {
			int wH = warp / W;
			int wW = warp % W;
			set.add(new Next(wH, wW, cdist + 1));
		}

		Set<Integer> warps = new HashSet<>();
		int key = h * W + w;
		warps.addAll(nodes[key].warps);
		for (Integer warp : warps) {
			nodes[warp].warps.remove(key);
		}
		nodes[key].warps.clear();

		return set;
	}

	void calc() {
		Deque<Next> que = new ArrayDeque<>();
		que.addAll(getNexts(cH, cW, 0));
		que.addAll(getWarps(cH, cW, 0));
		while (!que.isEmpty()) {
			Next next = que.pollFirst();
			int nextIndex = next.h * W + next.w;
			// System.out.println(" " + (next.h + 1) + " " + (next.w + 1) + " " + next.dist);
			nodes[nextIndex].hop = next.dist;
			if (next.h == dH && next.w == dW) {
				enable = true;
				break;
			}
			Set<Next> nexts = getNexts(next.h, next.w, next.dist);
			Set<Next> warps = getWarps(next.h, next.w, next.dist);
			for (Next n : nexts) {
				que.addFirst(n);
			}
			for (Next warp : warps) {
				que.addLast(warp);
			}
		}
	}

	void showResult() {
		if (enable) {
			System.out.println(nodes[dH * W + dW].hop);
		} else {
			System.out.println("-1");
		}
	}
}
