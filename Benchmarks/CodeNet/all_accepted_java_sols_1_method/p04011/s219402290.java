import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// 入力
		final int n, k ,x, y;
		try(Scanner scan = new Scanner(System.in)) {
			n = scan.nextInt();	// 1≤N,K≤10000
			k = scan.nextInt();
			x = scan.nextInt();	//1≤Y<X≤10000
			y = scan.nextInt();
		}
		
		int result = n <= k ? n * x : n * x + (n - k) * (y - x);
		
		// 出力
		try (PrintWriter out = new PrintWriter(System.out)) {
			out.println(result);
		}

	}

}
