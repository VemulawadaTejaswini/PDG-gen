import java.util.Scanner;


public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int prime = 0;
		for (int i = 0; i < n; i++) {
			int p = scan.nextInt();
			for (int j = p - 1; j > 0; j--) {
				if (j == 1) prime += 1;
				if (p % j == 0) break;
			}
		}
		System.out.println(prime);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}