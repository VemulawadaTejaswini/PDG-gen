import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[100];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		System.out.print(a[n - 1]);
		for(int i = n - 2; i >= 0; i--) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}