import java.util.Scanner;

import javax.xml.validation.SchemaFactoryConfigurationError;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int[] l = new int[q];
		int[] r = new int[q];

		for (int i = 0; i < q; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		//lcnt[i]・・・1文字目から i 文字目までのACの数
		int[] lcnt = new int[n + 1];
		lcnt[0] = 0;
		lcnt[1] = 0;

		for (int i = 0; i < n - 1; i++) {
			lcnt[i + 2] = lcnt[i + 1];
			if (s.substring(i, i + 2).equals("AC")) {
				lcnt[i + 2]++;
			}
		}

		for (int i = 0; i < q; i++) {
//			System.out.print("i:" + i + ", ");
//			System.out.print(
//					"lcnt[" + r[i] + "]:" + lcnt[r[i]] + ", lcnt[" + (l[i]) + "]:" + lcnt[l[i]] + ", ans:");
			System.out.println(lcnt[r[i]] - lcnt[l[i]]);
		}

		sc.close();
	}
}