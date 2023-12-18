
import static java.util.Arrays.deepToString;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			int t = sc.nextInt();
			if (t == 0) break;
			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				t -= end - start;
			}
			if (t <= 0) System.out.println("OK");
			else System.out.println(t);
		}
	}
}