import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();

		for (int i = x; i > 0; i--) {
			for (int b = 1; b < 32; b++) {
				for (int p = 2; p < 10; p++) {
					if ((int) Math.pow(b, p) == i) {
						System.out.println(i);
						return;
					}
				}
			}
		}
	}
}
