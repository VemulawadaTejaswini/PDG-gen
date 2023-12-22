
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int W = sc.nextInt();
		int H = sc.nextInt();

		char[][] a = new char[W][H];

		for (int i=0;i<W;i++) {
			a[i] = sc.next().toCharArray();
		}

		boolean[] hb = new boolean[H];
		boolean[] wb = new boolean[W];
		Arrays.fill(hb, false);
		Arrays.fill(wb, false);

		for (int i=0;i<H;i++) {
			for (int j=0;j<W;j++) {
				if (a[j][i] == '#') {
					hb[i] = true;
				}
			}
		}

		for (int i=0;i<W;i++) {
			for (int j=0;j<H;j++) {
				if (a[i][j] == '#') {
					wb[i] = true;
				}
			}
		}

		int H2 = H;
		for (int i=0;i<H;i++) {
			if (!hb[i]) {
				H2 -= 1;
			}
		}

		int W2 = W;
		for (int i=0;i<W;i++) {
			if (!wb[i]) {
				W2 -= 1;
			}
		}

//		System.out.println("H2="+H2+",W2="+W2);
		char[][] a2 = new char[W2][H2];

		int l=0;
		for (int i=0;i<W;i++) {
			int k=0;
			if (wb[i]) {
				for (int j=0;j<H;j++) {
					if (hb[j]) {
						//System.out.println(hb[i] | wb[j]);
						//System.out.println("k="+k+",l="+l);
						a2[l][k++] = a[i][j];
					}
				}
				l++;
			}

		}

		for (int i=0;i<W2;i++) {
			System.out.println(String.valueOf(a2[i]));
		}

	}

}
