import java.util.Arrays;
import java.util.Scanner;

public class Main {

	final int maxn = 101001;

	int l, d;
	String[] str = new String[3];
	char[] ans = new char[maxn];
	int[][] sum = new int[maxn][4];
	int[][] val = new int[maxn][3];

	boolean check(int idx, int valA, int valB, int valC) {
		int vala = sum[idx][0];
		int valb = sum[idx][1];
		int valc = sum[idx][2];
		int vald = sum[idx][3];
		if (d - valA < 0)
			return false;
		if (d - valB < 0)
			return false;
		if (d - valC < 0)
			return false;
		if (vala + valA > d) {
			valb += vala + valA - d;
			valc += vala + valA - d;
			vala = d - valA;
		}
		if (valb + valB > d) {
			vala += valb + valB - d;
			valc += valb + valB - d;
			valb = d - valB;
		}
		if (valc + valC > d) {
			vala += valc + valC - d;
			valb += valc + valC - d;
			valc = d - valC;
		}
		if (vala + valA > d || valb + valB > d)
			return false;
		int tmpA = Math.min(vald, d - vala - valA);
		int tmpB = Math.min(vald, d - valb - valB);
		int tmpC = Math.min(vald, d - valc - valC);
		if (tmpA + tmpB + tmpC < vald * 2)
			return false;
		return true;
	}

	void run() {

		Scanner scan = new Scanner(System.in);

		while (scan.hasNext()) {
			l = scan.nextInt();
			d = scan.nextInt();
			if (l == 0 && d == 0)
				break;
			for (int i = 0; i < 3; i++) {
				str[i] = scan.next();
			}
			for (int i = 0; i < maxn; i++)
				for (int j = 0; j < 4; j++)
					sum[i][j] = 0;
			for (int i = l - 1; i >= 0; i--) {
				for (int j = 0; j <= 3; j++) {
					sum[i][j] = sum[i + 1][j];
				}
				if (str[0].charAt(i) == str[1].charAt(i)
						&& str[1].charAt(i) == str[2].charAt(i))
					continue;
				if (str[0].charAt(i) == str[1].charAt(i))
					sum[i][2]++;
				else if (str[0].charAt(i) == str[2].charAt(i))
					sum[i][1]++;
				else if (str[1].charAt(i) == str[2].charAt(i))
					sum[i][0]++;
				else
					sum[i][3]++;
			}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < l; j++) {
					if (str[i].charAt(j) >= 'A' && str[i].charAt(j) <= 'Z') {
						val[j][i] = (int) (str[i].charAt(j) - 'A');
					} else {
						val[j][i] = (int) (str[i].charAt(j) - 'a' + 26);
					}
				}
			}
			if (check(0, 0, 0, 0) == false) {
				System.out.println("-1");
				continue;
			}

			int valA = 0, valB = 0, valC = 0;
			int ansA = 0, ansB = 0, ansC = 0;
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < 52; j++) {
					int tmpA = 0, tmpB = 0, tmpC = 0;
					if (j != val[i][0])
						tmpA = 1;
					if (j != val[i][1])
						tmpB = 1;
					if (j != val[i][2])
						tmpC = 1;
					valA = ansA + tmpA;
					valB = ansB + tmpB;
					valC = ansC + tmpC;
					if (check(i + 1, valA, valB, valC) == true) {
						if (j < 26) {
							ans[i] = (char) ('A' + j);
						} else {
							ans[i] = (char) ('a' + j - 26);
						}
						// System.out.println("HEHE " + i);
						ansA = valA;
						ansB = valB;
						ansC = valC;
						break;
					}
				}
				// System.out.println("HEHE " + i);
			}
			for (int i = 0; i < l; i++) {
				System.out.print(ans[i]);
			}
			System.out.println();
		}

	}

	public static void main(String arsgs[]) {
		new Main().run();
	}
}