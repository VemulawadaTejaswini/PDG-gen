import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
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
		int max = -1000001;
		int min = 1000001;
		BigDecimal sum = new BigDecimal(0);
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a > max) max=a;
			if (a < min) min=a;
			sum = sum.add(new BigDecimal(a));
		}
		System.out.println(min +" " + max + " " + sum);
	}
}

