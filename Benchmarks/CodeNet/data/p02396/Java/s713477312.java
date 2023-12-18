import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int s = 0;
		for (int i = 1;;i++) {
			 s = scan.nextInt();
			if (s == 0) break;
			System.out.println("case " + i + ": " + s);
		}
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}