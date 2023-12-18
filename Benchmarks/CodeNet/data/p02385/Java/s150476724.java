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
		public boolean eq(Dice d) {
			for (int p = 0; p < pat.length; p += 6) {
				boolean hit = true;
				for (int i = 0; i < 6; i++) {
					if (d.dig[i] != pat[p + i]) {
						hit = false;
						break;
					}
				}
				if (hit) {
					return true;
				}
			}
			return false;
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Dice l = new Dice(sc);
			Dice r = new Dice(sc);
			System.out.println(l.eq(r) ? "Yes" : "No");
		}
	}
}

