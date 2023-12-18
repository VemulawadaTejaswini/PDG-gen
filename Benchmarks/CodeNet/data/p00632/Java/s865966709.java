import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;

	int[] dx = { 1, 0, -1, 0, 0 };
	int[] dy = { 0, 1, 0, -1, 0 };

	void run() {
		for (;;) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if ((H | W) == 0) {
				return;
			}
			char[][] field = new char[H][W];
			// HashSet<String> hs = new HashSet<String>();
			boolean visit[][][][] = new boolean[H][W][H][W];
			int allcnt = 0;
			int gH = 0, gW = 0, goH = 0, goW = 0;
			for (int i = 0; i < H; i++) {
				String input = sc.next();
				for (int j = 0; j < W; j++) {
					field[i][j] = input.charAt(j);
					if (input.charAt(j) == 'A') {
						gH = i;
						gW = j;
					}
					if (input.charAt(j) == 'B') {
						goH = i;
						goW = j;
					}
				}
			}
			String direction = sc.next();
			Queue<int []> queue = new LinkedList<int []>();
			queue.add(new int[]{gH,gW});
			int nowGohostH = goH;
			int nowGohostW = goW;
			int cnt = 0;
			int ansH = 0;
			int ansW = 0;
			int index = 0;
			boolean able = false;
			int roop = 0;
			label: while (!queue.isEmpty()) {
				int size = queue.size();
				char exe = direction.charAt(index % direction.length());
				for (int I = 0; I < size; I++) {
					int now[] = queue.poll();
					if (now[0] == nowGohostH && now[1] == nowGohostW) {
						ansH = now[0];
						ansW = now[1];
						able = true;
						break label;
					}
					// hs.add(now.girlH + "-" + now.girlW + "-" + now.gohostH
					// + "-" + now.gohostW);
					int girl_nextH = 0;
					int girl_nextW = 0;
					for (int i = 0; i < 5; i++) {
						girl_nextH = now[0] + dy[i];
						girl_nextW = now[1] + dx[i];
						if (girl_nextH < 0) {
							girl_nextH = 0;
						}
						if (girl_nextH == H) {
							girl_nextH = H - 1;
						}
						if (girl_nextW < 0) {
							girl_nextW = 0;
						}
						if (girl_nextW == W) {
							girl_nextW = W - 1;
						}
						if (0 <= girl_nextH && girl_nextH < H
								&& 0 <= girl_nextW && girl_nextW < W
								&& 0 <= nowGohostH && nowGohostH < H
								&& 0 <= nowGohostW && nowGohostW < W
								&& field[girl_nextH][girl_nextW] != '#') {
							int[] next = {girl_nextH, girl_nextW};
							if (!visit[next[0]][next[1]][nowGohostH][nowGohostW]) {
								visit[next[0]][next[1]][nowGohostH][nowGohostW] = true;
								roop = 0;
								queue.add(next);
								//allcnt++;
							}
						}
					}
					if (queue.isEmpty()) {
						roop++;
						if (roop <= 10) {
							queue.add(now);
						}
					}
				}
				cnt++;
				index++;
				if (exe == '5') {
					nowGohostW = nowGohostW + dx[4];
					nowGohostH = nowGohostH + dy[4];
				}
				if (exe == '8') {
					nowGohostW = nowGohostW + dx[3];
					nowGohostH = nowGohostH + dy[3];
				}
				if (exe == '6') {
					nowGohostW = nowGohostW + dx[0];
					nowGohostH = nowGohostH + dy[0];
				}
				if (exe == '4') {
					nowGohostW = nowGohostW + dx[2];
					nowGohostH = nowGohostH + dy[2];
				}
				if (exe == '2') {
					nowGohostW = nowGohostW + dx[1];
					nowGohostH = nowGohostH + dy[1];
				}
				if (nowGohostH < 0) {
					nowGohostH = 0;
				}
				if (nowGohostH == H) {
					nowGohostH = H - 1;
				}
				if (nowGohostW < 0) {
					nowGohostW = 0;
				}
				if (nowGohostW == W) {
					nowGohostW = W - 1;
				}
			}
			System.out.println(able ? cnt + " " + ansH + " " + ansW
					: "impossible");
	//		System.out.println(" ->" + allcnt);
		}
	}

	class Info {
		int girlH;
		int girlW;

		public Info(int girlH, int girlW) {
			this.girlH = girlH;
			this.girlW = girlW;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(char[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}
	}
}