import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String S = scan.next();

		int sashihiki = 0;
		int n = S.length();
		int[] Srow = new int[n];
		String[] hugou = new String[n-1];

		for (int i = 0; i < n; i++) {
			Srow[i] = Integer.parseInt(S.substring(i, i+1));
		}

		for (int bit = 0; bit < Math.pow(2, n-1); bit++) {

			sashihiki = Srow[0];

			for (int shift = 0; shift < n-1; shift++) {		//全ビット探索：1が+に対応

				if ((1&bit>>shift) == 1) {
					sashihiki += Srow[shift+1];
					hugou[shift] = "+";
				} else {
					sashihiki -= Srow[shift+1];
					hugou[shift] = "-";
				}

			}

			if (sashihiki == 7) {
				break;
			}

		}


		if (sashihiki == 7) {

			for (int op = 0; op < n; op++) {
				System.out.print(Srow[op]);
				if (op < n-1) {
					System.out.print(hugou[op]);
				}
			}

			System.out.println("=7");

		} else {

			System.out.print("ないです");

		}

	}
}