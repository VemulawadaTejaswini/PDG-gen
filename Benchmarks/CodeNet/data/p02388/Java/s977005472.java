import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println(x*x*x);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}