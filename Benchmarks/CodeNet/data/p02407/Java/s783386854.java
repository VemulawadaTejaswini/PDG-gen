import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		for(int i = a.length - 1; i >= 0; i--) {
			System.out.print(" " + a[i]);
		}
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}