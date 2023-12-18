import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int sum = 0;
			double z = 0;
			int[] s = new int[n];
			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
				sum += s[i];
			}
			double m = (double) sum / n;
			for (int i = 0; i < n; i++) {
				z += (double) (s[i] - m) * (s[i] - m);
			}
			double a = Math.sqrt((double) z / n);
			System.out.println(a);
		}
	}
}