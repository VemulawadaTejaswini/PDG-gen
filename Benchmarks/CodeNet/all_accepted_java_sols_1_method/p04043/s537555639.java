import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) {
		// 入力
		final int[] a = new int[3];
		try(Scanner scan = new Scanner(System.in)) {
			a[0] = scan.nextInt();
			a[1] = scan.nextInt();
			a[2] = scan.nextInt();
		}
		int count5 = 0;
		int count7 = 0;
		
		for (int i = 0; i < 3; i++) {
			if (a[i] == 5) {
				count5++;
			} else if (a[i] == 7) {
				count7++;
			}
		}
		final boolean result = count5 == 2 && count7 == 1;
		
		// 出力
		out.println(result ? "YES" : "NO");
		out.flush();
	}
}
