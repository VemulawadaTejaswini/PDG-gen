import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());

		out.println(otoshidama(N, Y));
		out.flush();
	}
	
	public static String otoshidama(int N, int Y) {
		int a = N;
		for (int b = 0; b <= N; b++) {
			for (int c = 0; c <= N-b; c++) {
				int total = 10000*(a-b-c)+5000*b+1000*c;
				if (total == Y) {
					return String.format("%d %d %d", (a-b-c), b, c);
				}
			}
		}
		return "-1 -1 -1";
	}
}