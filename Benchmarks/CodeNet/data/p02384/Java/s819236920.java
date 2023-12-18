import java.util.Scanner;

class Main {
	static final String CODE = "012345024135031425043215103254120534135024152304201453215043240513254103304152310542345012351402402351425031430521453201513240521430534120542310";

	static class Dice {
		private int[] dig;
		private int[] pat;
		public Dice(Scanner s) {
			dig = new int[6];
			for (int i = 0; i < dig.length; i++) {
				dig[i] = s.nextInt();
			}
			pat = new int[CODE.length()];
			for (int i = 0; i < pat.length; i++) {
				int p = CODE.charAt(i) - '0';
				pat[i] = dig[p];
			}
		}
		public int scan(int x, int y) {
			int p = 0;
			for (; p < pat.length; p += 6) {
				if (pat[p] == x && pat[p + 1] == y) {
					return pat[p + 2];
				}
			}
			return -1;
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Dice d = new Dice(sc);
			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int s = d.scan(x, y);
				System.out.println(Integer.toString(s));
			}
		}
	}
}

