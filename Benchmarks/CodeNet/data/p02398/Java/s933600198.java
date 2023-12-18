import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int count = 0;
		for (int i = a; i <= b; i++) {
			if (c % i == 0) count += 1;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}