import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			int i2 = (int) (i * 1.08);
			if (i2 == n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(":(");
	}
}
