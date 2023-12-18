import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while (true){
			int n = scanner.nextInt();
			if (n == 0) break;
			int s[] = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				s[i] = scanner.nextInt();
				sum += s[i];
			}
			double m = sum / (double)n;
			double sum2 = 0;
			for (int i = 0; i < n; i++) {
				sum2 += (s[i] - m) * (s[i] - m);
			}
			double a = Math.sqrt(sum2 / (double)n);
			System.out.println(a);
		}
	}
}
