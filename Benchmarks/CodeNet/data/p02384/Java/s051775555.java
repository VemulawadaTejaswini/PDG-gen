import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] arges) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] deme = line.split(" ");

		Daice daice = new Daice(Integer.parseInt(deme[0]),
				Integer.parseInt(deme[1]), Integer.parseInt(deme[2]),
				Integer.parseInt(deme[3]), Integer.parseInt(deme[4]),
				Integer.parseInt(deme[5]));
		String line2 = sc.nextLine();
		int kazu = Integer.parseInt(line2);
		String[] mondai = new String[kazu];

		for (int i = 0; i < kazu; i++) {
			mondai[i] = sc.nextLine();
		}

		for (String string : mondai) {
			String[] mondai2 = string.split(" ");

			int ue = Integer.parseInt(mondai2[0]);
			int mae = Integer.parseInt(mondai2[1]);
			while (true) {
				
				if ((mae!=daice.f3&&ue!=daice.f4)||mae!=daice.f4&&ue!=daice.f3) {
					daice.south();
				}else {
					daice.west();
				}
				if (daice.f1 == ue && mae == daice.f2) {
					break;
				}
			}System.out.println(daice.f3);

		}
	}

	public static class Daice {

		int f1;
		int f2;
		int f3;
		int f4;
		int f5;
		int f6;

		public Daice(int f1, int f2, int f3, int f4, int f5, int f6) {
			super();
			this.f1 = f1;
			this.f2 = f2;
			this.f3 = f3;
			this.f4 = f4;
			this.f5 = f5;
			this.f6 = f6;
		}

		public void south() {
			int[] fs = new int[] { f1, f2, f3, f4, f5, f6 };
			f6 = fs[1];
			f2 = fs[0];
			f1 = fs[4];
			f5 = fs[5];

		}

		public void nouth() {
			int[] fs = new int[] { f1, f2, f3, f4, f5, f6 };
			f6 = fs[4];
			f2 = fs[5];
			f1 = fs[1];
			f5 = fs[0];
		}

		public void east() {
			int[] fs = new int[] { f1, f2, f3, f4, f5, f6 };
			f6 = fs[2];
			f3 = fs[0];
			f1 = fs[3];
			f4 = fs[5];
		}

		public void west() {
			int[] fs = new int[] { f1, f2, f3, f4, f5, f6 };
			f6 = fs[3];
			f3 = fs[5];
			f1 = fs[2];
			f4 = fs[0];

		}

	}
}