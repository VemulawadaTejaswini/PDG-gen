import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = (int) Math.pow(10, 5);
		for (int i = 0; i < n; i++) {
			m *= 1.05;
			int range = 1000;
			if (m % range != 0)
				m = (m / range + 1) * range;
		}
		System.out.println(m);
		sc.close();

	}
}