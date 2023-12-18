import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[][] face, count;
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			face = new int[201][201];
			count = new int[201][201];
			for (int i = 0; i < N; ++i) {
				fall();
			}
			int[] ans = new int[7];
			for (int i = 0; i < face.length; ++i) {
				for (int j = 0; j < face[0].length; ++j) {
					ans[face[i][j]]++;
				}
			}
			for (int i = 1; i <= 5; ++i) {
				System.out.print(ans[i] + " ");
			}
			System.out.println(ans[6]);
		}
	}

	static void fall() {
		int T = sc.nextInt();
		int F = sc.nextInt();
		Dice dice = new Dice(T, F);
		int r = 100;
		int c = 100;
		while (true) {
			int dir = -1;
			int num = -1;
			for (int i = 0; i < 4; ++i) {
				if (count[r][c] > count[r + DR[i]][c + DC[i]] && dice.val[i + 1] > 3 && dice.val[i + 1] > num) {
					dir = i;
					num = dice.val[i + 1];
				}
			}
			if (dir == 0) {
				dice.rollN();
			} else if (dir == 1) {
				dice.rollE();
			} else if (dir == 2) {
				dice.rollS();
			} else if (dir == 3) {
				dice.rollW();
			} else {
				break;
			}
			r += DR[dir];
			c += DC[dir];
		}
		count[r][c]++;
		face[r][c] = dice.top();
	}

	static class Dice {
		int[] val = new int[6]; // top, north, east, south, west, bottom

		Dice(int top, int north, int east) {
			val[0] = top;
			val[1] = north;
			val[2] = east;
			val[3] = 7 - north;
			val[4] = 7 - east;
			val[5] = 7 - top;
		}

		Dice(int top, int north) {
			this(1, 3, 2);
			if (top == bottom()) {
				rollE();
				rollE();
			} else if (top == north()) {
				rollS();
			} else if (top == east()) {
				rollW();
			} else if (top == south()) {
				rollN();
			} else if (top == west()) {
				rollE();
			}
			while (north != north()) {
				rollClockwise();
			}
		}

		Dice(int[] val) {
			if (val[0] + val[5] != 7 || val[1] + val[3] != 7 || val[2] + val[4] != 7) throw new RuntimeException();
			for (int i = 0; i < 6; ++i) {
				this.val[i] = val[i];
			}
		}

		void rollN() {
			int tmp = north();
			this.val[1] = this.val[0];
			this.val[0] = this.val[3];
			this.val[3] = this.val[5];
			this.val[5] = tmp;
		}

		void rollS() {
			int tmp = south();
			this.val[3] = this.val[0];
			this.val[0] = this.val[1];
			this.val[1] = this.val[5];
			this.val[5] = tmp;
		}

		void rollE() {
			int tmp = east();
			this.val[2] = this.val[0];
			this.val[0] = this.val[4];
			this.val[4] = this.val[5];
			this.val[5] = tmp;
		}

		void rollW() {
			int tmp = west();
			this.val[4] = this.val[0];
			this.val[0] = this.val[2];
			this.val[2] = this.val[5];
			this.val[5] = tmp;
		}

		void rollClockwise() {
			int tmp = south();
			this.val[3] = this.val[2];
			this.val[2] = this.val[1];
			this.val[1] = this.val[4];
			this.val[4] = tmp;
		}

		int top() {
			return this.val[0];
		}

		int bottom() {
			return this.val[5];
		}

		int north() {
			return this.val[1];
		}

		int south() {
			return this.val[3];
		}

		int east() {
			return this.val[2];
		}

		int west() {
			return this.val[4];
		}

		public String toString() {
			String ret = "   " + top() + "   \n";
			ret += north() + " " + east() + " " + south() + " " + west() + "\n";
			ret += "   " + bottom() + "   ";
			return ret;
		}
	}

}