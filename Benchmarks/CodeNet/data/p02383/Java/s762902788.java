import java.util.Scanner;

// Main
class Main {
	static final int[] I = new int[] {0,1,5,4,0,2,5,3};

	static class Dice {
		private int[] dig;
		public Dice(Scanner s) {
			dig = new int[6];
			for (int i = 0; i < dig.length; i++) {
				dig[i] = s.nextInt();
			}
		}
		private void rot(int q, int s) {
			int p = (s > 0) ? q : q + 3;
			int dd = dig[I[p]];
			for (int i = 0; i < 3; i++, p += s) {
				dig[I[p]] = dig[I[p + s]];
			}
			dig[I[p]] = dd;
		}
		public int roll(String op) {
			int sz = op.length();
			for (int i = 0; i < sz; i++) {
				char ch = op.charAt(i);
				switch (ch) {
				case 'N': rot(0, 1); break;
				case 'S': rot(0,-1); break;
				case 'W': rot(4, 1); break;
				case 'E': rot(4,-1); break;
				}
			}
			return dig[0];
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Dice d = new Dice(sc);
			sc.nextLine();
			String op = sc.nextLine();
			int top = d.roll(op);
			System.out.println(Integer.toString(top));
		}
	}
}

