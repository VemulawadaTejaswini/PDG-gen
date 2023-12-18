import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		String result = "";
		while (N > 0) {
			result = N % K + result;
			N /= K;
		}

		out.println(result.length());
		out.flush();
	}
}