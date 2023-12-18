import java.util.Scanner;

public class Main {
	final double s = 3.305785;

	void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("%.6f", 1.0 * a * b / s);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}