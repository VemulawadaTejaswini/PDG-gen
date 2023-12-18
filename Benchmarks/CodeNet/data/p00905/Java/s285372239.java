import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int p = scanner.nextInt();
			if (p == 0) {
				scanner.close();
				break;
			}
			int q = scanner.nextInt();

			int[] pr = new int[p];
			int[] pc = new int[p];
			int[] ps = new int[p];
			int[] indent = new int[p];

			String[] pStrings = new String[p];
			for (int i = 0; i < p; i++) {
				pStrings[i] = scanner.next();
				if (i != 0) {
					pr[i] += pr[i - 1];
					pc[i] += pc[i - 1];
					ps[i] += ps[i - 1];
				}
				pr[i] += pStrings[i].length() - pStrings[i].replaceAll("\\(", "").length();
				pr[i] -= pStrings[i].length() - pStrings[i].replaceAll("\\)", "").length();
				pc[i] += pStrings[i].length() - pStrings[i].replaceAll("\\{", "").length();
				pc[i] -= pStrings[i].length() - pStrings[i].replaceAll("\\}", "").length();
				ps[i] += pStrings[i].length() - pStrings[i].replaceAll("\\[", "").length();
				ps[i] -= pStrings[i].length() - pStrings[i].replaceAll("\\]", "").length();
				indent[i] = pStrings[i].length() - pStrings[i].replaceAll("^\\.*", "").length();
			}

			/*
			 * indent[i]=R*(ro[i-1]-rc[i-1])+C*()+S*
			 */
			ArrayList<Integer[]> RCSs = new ArrayList<Integer[]>();
			for (int R = 1; R <= 20; R++) {
				for (int C = 1; C <= 20; C++) {
					for (int S = 1; S <= 20; S++) {
						boolean check = true;
						for (int i = 1; i < indent.length; i++) {
							int tmp = R * (pr[i - 1]) + C * (pc[i - 1]) + S * (ps[i - 1]);
							if (tmp != indent[i]) {
								check = false;
							}
						}
						if (check) {
							Integer[] add = { R, C, S };
							RCSs.add(add);
						}
					}
				}
			}

			int qr = 0, qs = 0, qc = 0;
			for (int i = 0; i < q; i++) {
				String qStrings = scanner.next();
				int ans = -1;
				for (Integer[] RCS : RCSs) {
					int master = RCS[0] * qr + RCS[1] * qc + RCS[2] * qs;
					if (ans != -1 && ans != master) {
						ans = -1;
						break;
					} else {
						ans = master;
					}
				}
				System.out.print(ans);
				if (i < q - 1) {
					System.out.print(" ");
				}
				qr += qStrings.length() - qStrings.replaceAll("\\(", "").length();
				qr -= qStrings.length() - qStrings.replaceAll("\\)", "").length();
				qc += qStrings.length() - qStrings.replaceAll("\\{", "").length();
				qc -= qStrings.length() - qStrings.replaceAll("\\}", "").length();
				qs += qStrings.length() - qStrings.replaceAll("\\[", "").length();
				qs -= qStrings.length() - qStrings.replaceAll("\\]", "").length();
			}
			System.out.println();
		}
	}
}