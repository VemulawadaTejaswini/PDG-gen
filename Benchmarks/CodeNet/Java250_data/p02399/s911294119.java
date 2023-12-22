import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.printf("%f\n", (double)a/b);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}