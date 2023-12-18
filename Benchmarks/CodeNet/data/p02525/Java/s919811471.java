import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double m, bunsan, bunsan2, sum = 0, sum2 = 0;
		int[] s;
		s = new int[1000];
		while (n != 0) {

			for (int i = 0; i < n; i++) {
				int a = scan.nextInt();
				s[i] = a;
				sum += a;
			}
			m = sum / n;
			for (int j = 0; j < n; j++) {
				sum2 += (s[j] - m) * (s[j] - m);
			}
			bunsan2 = sum2 / n;
			bunsan = Math.sqrt(bunsan2);
			System.out.println(bunsan);
			n = scan.nextInt();
			sum = 0;
			sum2 = 0;
		}
	}

}