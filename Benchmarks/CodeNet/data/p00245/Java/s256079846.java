
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			w = scanner.nextInt();
			h = scanner.nextInt();
			if ((w | h) == 0)
				break;
			int[][] map = new int[h][w];
			int sy = -1;
			int sx = -1;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					char now = scanner.next().charAt(0);
					if (now == 'P') {
						sy = i;
						sx = j;
						map[i][j] = -1;
					} else if (now == '.')
						map[i][j] = -1;
					else
						map[i][j] = Character.getNumericValue(now);
				}
			}
			int n = scanner.nextInt();
			int maxT = 0;
			Goods[] goods = new Goods[n];
			for (int i = 0; i < n; i++) {
				int num = scanner.nextInt();
				int c = scanner.nextInt();
				int start = scanner.nextInt();
				int end = scanner.nextInt();
				goods[num] = new Goods(c, start, end);
				maxT = Math.max(maxT, end);
			}
			Deque<State> deque = new ArrayDeque<Main.State>();
			deque.offer(new State(sy, sx, 0, 0, 0));
			boolean[][][][] b = new boolean[maxT + 1][1 << n][h][w];
			b[2][0][sy][sx]=true;
			int ans = 0;
			while (!deque.isEmpty()) {
				State state = deque.poll();
				ans = Math.max(ans, state.value);
				int y = state.y;
				int x = state.x;
				if (state.step == maxT)
					break;
				if (state.bit == (1 << n) - 1)
					break;
				for (int[] m : move) {
					int ny = m[0] + y;
					int nx = m[1] + x;
					if (!isOK(ny, nx))
						continue;
					if (map[ny][nx] != -1)
						continue;
					int nextstep = state.step + 1;
					int nextbit = state.bit;
					int nextvalue = state.value;
					for (int[] mo : move) {
						int nny = mo[0] + ny;
						int nnx = mo[1] + nx;
						if (!isOK(nny, nnx))
							continue;
						if (map[nny][nnx] == -1)
							continue;
						int num = map[nny][nnx];
						if (goods[num].start <= nextstep
								&& nextstep < goods[num].end) {
							if (((nextbit >> num) & 1) == 1)
								continue;
							nextbit = nextbit | (1<<num);
							nextvalue += goods[num].c;
						}
					}
					if (b[nextstep][nextbit][ny][nx])
						continue;
					b[nextstep][nextbit][ny][nx] = true;
					deque.offer(new State(ny, nx, nextstep, nextbit, nextvalue));

				}
			}
			System.out.println(ans);

		}
	}

	private boolean isOK(int y, int x) {
		if (0 <= y && y < h && 0 <= x && x < w)
			return true;
		return false;
	}

	int h, w;
	int[][] move = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };

	class State {
		int y, x, step, bit, value;

		public State(int y, int x, int step, int bit, int value) {
			super();
			this.y = y;
			this.x = x;
			this.step = step;
			this.bit = bit;
			this.value = value;
		}

		@Override
		public String toString() {
			return "State [y=" + y + ", x=" + x + ", step=" + step + ", bit="
					+ bit + ", value=" + value + "]";
		}
		

	}

	class Goods {
		int c, start, end;

		public Goods(int c, int start, int end) {
			super();
			this.c = c;
			this.start = start;
			this.end = end;
		}

		@Override
		public String toString() {
			return "Goods [c=" + c + ", start=" + start + ", end=" + end + "]";
		}

	}
}