import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	String INPUT = "";
	
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(new ByteArrayInputStream(INPUT.getBytes()));
		PrintWriter out = new PrintWriter(System.out);
		
		solve(sc, out);
		out.flush();
	}
	
	void solve(Scanner sc, PrintWriter out) {
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i%3 == 0) {
				System.out.print(" " + i);
				continue;
			}
			if (i%10 == 3) {
				System.out.print(" " + i);
				continue;
			}
			int x = i/10;
			while (x > 0) {
				boolean flg = false;
				if (x%10 == 3) {
					System.out.print(" " + i);
					flg = true;
				}
				if (flg) break;
				x /= 10;
			}
		}
		System.out.println();
	}
}

