import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();
		for (int x = 0; x <= N; x++) {
			for (int y = 0; y <= N - x; y++) {
				int z = N - x - y;
				int sum = x * 10000 + y * 5000 + z * 1000;
				if (sum == Y) {
					System.out.println(x + " " + y + " " + z);
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}
}