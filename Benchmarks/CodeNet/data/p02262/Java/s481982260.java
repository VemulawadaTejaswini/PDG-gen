import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		int n = Integer.parseInt(line1);

		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			String kari = sc.nextLine();
			A[i] = Integer.parseInt(kari);
		}

		int v = 0;
		int k = 0;

		int cnt = 0;
		int m = 1;

		ArrayList<Integer> G = new ArrayList<Integer>();
		while (true) {
			G.add(m);

			m = 2 * (m + 1) - 1;

			if (m > n) {
				break;
			}
		}
		Collections.reverse(G);

		// int pow = n;
		// while (pow > 2) {
		// pow = pow/2;
		// m++;
		// }

		// int[] G = new int[m];
		// for (int i = 0; i < m; i++) {
		// double X = Math.pow((double) 2, (double) m - i - 1);
		// G[i] = (int) X;
		// }

		for (int i = 0; i < G.size(); i++) {
			for (int j = G.get(i); j < n; j++) {
				v = A[j];
				k = j - G.get(i);
				while (k >= 0 && A[k] > v) {
					A[k + G.get(i)] = A[k];
					k = k - G.get(i);
					cnt++;
				}
				A[k + G.get(i)] = v;
			}
		}

		System.out.println(G.size());
		for (int l = 0; l < G.size() - 1; l++) {
			System.out.print(G.get(l));
			System.out.print(" ");
		}
		System.out.println(G.get(G.size() - 1));

		System.out.println(cnt);
		for (int l = 0; l < n; l++) {
			System.out.println(A[l]);
		}

	}
}