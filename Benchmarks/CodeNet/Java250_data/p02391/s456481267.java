import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if (num1 > num2) {
			System.out.println("a > b");
		} else if (num1 < num2) {
			System.out.println("a < b");
		} else {
			System.out.println("a == b");
		}
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}