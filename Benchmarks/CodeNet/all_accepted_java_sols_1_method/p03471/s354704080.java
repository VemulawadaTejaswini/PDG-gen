import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		boolean t = false;
		for (int x = 0; x <= N && t == false; x++) {
			for (int y = 0; y <= N && t == false; y++) {
				int sum = x * 10000 + y * 5000;
				if (Y - sum >= 0) {
					int z = (Y - sum) % 1000 == 0 ? (Y - sum) / 1000 : 0;
					sum = sum + z * 1000;
					if (x + y + z == N) {
						System.out.println(x + " " + y + " " + z);
						t = true;
					}
				}
			}
		}
		if (t == false) {
			System.out.println("-1 -1 -1");
		}
		sc.close();
	}
}