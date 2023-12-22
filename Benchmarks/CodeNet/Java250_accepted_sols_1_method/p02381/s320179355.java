import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while ((n = sc.nextInt()) != 0) {
			int[] s = new int[n];
			double m = 0, sd = 0;
			
			for (int i=0; i < n; i++) {
				s[i] = sc.nextInt();
				m += s[i];
			}
			m /= n;
			for (int i: s) sd += (i - m) * (i - m);
			System.out.println(Math.sqrt(sd/n));
		}
		sc.close();
	}
}