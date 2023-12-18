import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			else {
				int[] s = new int[n];
				int sum1 = 0;
				double sum2 = 0;
				for (int i = 0; i < n; i++) {
					s[i] = sc.nextInt();
					sum1 += s[i];
				}
				double m = (double) sum1 / n;
				for (int i = 0; i < n; i++) {
					sum2 += (s[i] - m) * (s[i] - m);
				}
				double sd = Math.sqrt((double) sum2 / n);
				System.out.println(sd);
			}
		}
		sc.close();
	}

}

