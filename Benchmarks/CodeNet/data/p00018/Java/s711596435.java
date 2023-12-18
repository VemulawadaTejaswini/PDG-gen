import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private int[] a = new int[5];

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			a[i] = scan.nextInt();
		}
		Arrays.sort(a);
		for (int i = 4; i >= 0; i--) {
			System.out.print(a[i] + (i != 0 ? " " : "\n"));
		}
	}
	
	private void debug() {
		System.out.println();
	}

}