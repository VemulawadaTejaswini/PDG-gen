import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while ((n = sc.nextInt()) != 0) {
			int[] s = new int[n];
			int sum = 0;
			for (int i=0; i < n; i++) {
				s[i] = sc.nextInt();
				sum += s[i];
			}
			double m = sum / n, sd = 0;
			for (int i=0; i < n; i++) {
				sd += (s[i] - m) * (s[i] - m) / n;
			}
			System.out.println(Math.sqrt(sd));
		}
		sc.close();
	}
}