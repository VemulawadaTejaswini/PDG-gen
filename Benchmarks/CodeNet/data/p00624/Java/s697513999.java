import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };
	static int H, W;
	static Point goal;
	static char[][] f = new char[10][10];

	static State simulate(State state, int containerIdx) {
		Point containerPos = state.container.get(containerIdx);
		int dr = containerPos.x - state.pos.x;
		int dc = containerPos.y - state.pos.y;
		int r = containerPos.x + dr;
		int c = containerPos.y + dc;
		State ret = state.clone();
		for (int i = 0;; ++i) {
			if (state.hitContainter(r, c) >= 0 || f[r][c] == '#') {
				if (i == 0) {
					return null;
				} else {
					break;
				}
			}
			if ('0' <= f[r][c] && f[r][c] < '3' && !state.panelBroken(f[r][c] - '0')) {
				ret.breakPanel(f[r][c] - '0');
				ret.container.remove(containerIdx);
				break;
			}
			ret.container.get(containerIdx).x = r;
			ret.container.get(containerIdx).y = c;
			r += dr;
			c += dc;
		}
		return ret;
	}

	static int solve(State start) {
		HashSet<State> visited = new HashSet<State>();
		visited.add(start);
		ArrayList<State> cur = new ArrayList<State>();
		cur.add(start);
		for (int turn = 0; !cur.isEmpty(); ++turn) {
			for (int i = 0; i < 4; ++i) {
				ArrayList<State> add = new ArrayList<State>();
				for (State st : cur) {
					int nr = st.pos.x + DR[i];
					int nc = st.pos.y + DC[i];
					int containerIdx = st.hitContainter(nr, nc);
					if (containerIdx >= 0) {
						State nst = simulate(st, containerIdx);
						if (nst != null && !visited.contains(nst)) {
							visited.add(nst);
							add.add(nst);
						}
					}
				}
				cur.addAll(add);
			}
			ArrayList<State> next = new ArrayList<State>();
			for (State st : cur) {
				if (st.pos.equals(goal)) return turn;
				for (int i = 0; i < 4; ++i) {
					int nr = st.pos.x + DR[i];
					int nc = st.pos.y + DC[i];
					if (f[nr][nc] == '#') continue;
					int containerIdx = st.hitContainter(nr, nc);
					if (containerIdx >= 0) {
						continue;
					}
					if (f[nr][nc] == '.' || ('0' <= f[nr][nc] && f[nr][nc] < '3' && st.panelBroken(f[nr][nc] - '0'))) {
						State nst = st.clone();
						nst.pos = new Point(nr, nc);
						if (!visited.contains(nst)) {
							visited.add(nst);
							next.add(nst);
						}
					}
				}
			}
			cur = next;
		}
		return -1;
	}

	public static void main(String[] args) throws Exception {
		while (true) {
			H = sc.nextInt();
			W = sc.nextInt();
			if (H == 0) break;
			int panelCount = 0;
			State start = new State();
			for (int i = 0; i < H; ++i) {
				String line = sc.next();
				f[i] = line.toCharArray();
				for (int j = 0; j < W; ++j) {
					if (f[i][j] == 'w') {
						f[i][j] = (char) ('0' + panelCount);
						++panelCount;
					} else if (f[i][j] == 'c') {
						f[i][j] = '.';
						start.container.add(new Point(i, j));
					} else if (f[i][j] == '@') {
						f[i][j] = '.';
						start.pos = new Point(i, j);
					} else if (f[i][j] == 'E') {
						f[i][j] = '.';
						goal = new Point(i, j);
					}
				}
			}
			System.out.println(solve(start));
		}
	}

	static class State {
		Point pos;
		ArrayList<Point> container = new ArrayList<Point>();
		int panel = 0;

		public State clone() {
			State ret = new State();
			ret.pos = (Point) this.pos.clone();
			for (Point p : this.container) {
				ret.container.add((Point) p.clone());
			}
			ret.panel = this.panel;
			return ret;
		}

		int hitContainter(int r, int c) {
			for (int i = 0; i < container.size(); ++i) {
				if (container.get(i).x == r && container.get(i).y == c) return i;
			}
			return -1;
		}

		boolean panelBroken(int panelIndex) {
			return (this.panel & (1 << panelIndex)) != 0;
		}

		void breakPanel(int panelIndex) {
			this.panel |= (1 << panelIndex);
		}

		public int hashCode() {
			final int prime = 31;
			int result = pos.hashCode();
			result = prime * result + container.hashCode();
			result = prime * result + panel;
			return result;
		}

		public boolean equals(Object obj) {
			if (getClass() != obj.getClass()) return false;
			State other = (State) obj;
			return this.pos.equals(other.pos) && this.container.equals(other.container) && this.panel == other.panel;
		}

	}

}