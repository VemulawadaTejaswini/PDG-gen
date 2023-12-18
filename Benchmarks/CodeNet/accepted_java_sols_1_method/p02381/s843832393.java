import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			while (true) {
				int n = sc.nextInt();
				if (n == 0)
					break;
				double sum = 0;
				int[] s = new int[n];
				for (int i = 0; i < n; i++) {
					s[i] = sc.nextInt();
					sum += s[i];
				}
				//平均値
				double m = sum / n;
				//α2 = (∑ni=1(si - m)2)/n
				double aa = 0;
				for (int i = 0; i < n; i++) {
					aa += Math.pow(s[i] - m, 2) / n;
				}
				System.out.println(Math.sqrt(aa));

			}

		}
	}
}
