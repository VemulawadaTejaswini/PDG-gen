import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		while(scan.hasNext()){
			out.println(gcd(si(),si()));
		}
		out.flush();
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}