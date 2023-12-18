import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		double m = 0;
		double temp = 0;
		int count = 0;
		double ans[] = new double[1000];
		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;
			int s[] = new int[n];
			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
				m += s[i];
			}
			m = m / n;
			for (int i = 0; i < n; i++) {
				temp += (s[i] - m) * (s[i] - m);
			}
			ans[count] = Math.sqrt(temp / n);
			m = 0;
			temp = 0;
			count++;
		}
		for (int i = 0; i < count; i++) {
			System.out.println(ans[i]);
		}
	}
}
