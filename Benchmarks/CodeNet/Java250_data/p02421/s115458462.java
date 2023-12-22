import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int tscore = 0;
		int hscore = 0;
		for (int i = 0; i < n; i++) {
			String tcard = scan.next();
			String hcard = scan.next();
			if (tcard.compareToIgnoreCase(hcard) > 0) {
				tscore += 3;
			} else if (tcard.compareToIgnoreCase(hcard) < 0) {
				hscore += 3;
			} else {
				tscore += 1;
				hscore += 1;
			}
		}
		System.out.printf("%d %d\n", tscore, hscore);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}