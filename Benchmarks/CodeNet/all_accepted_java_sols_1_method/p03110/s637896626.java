import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double X[] = new double[N];
		String u[] = new String[N];

		double ans = 0;
		for (int i = 0; i < N; i++) {
			X[i] = sc.nextDouble();
			u[i] = sc.next();
			if (u[i].equals("BTC")) {
				ans += X[i] * 380000;
			} else {
				ans += X[i];
			}
		}
		sc.close();
		System.out.println(ans);
	}
}
