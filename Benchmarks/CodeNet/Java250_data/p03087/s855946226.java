import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	static void exec(Scanner in, PrintStream out) {
		in.nextInt();
		int Q = in.nextInt();
		String S = in.next();
		int[] t = new int[S.length()];
		for (int i = 0; i < t.length - 1; i += 1) {
			if (S.charAt(i) == 'A' && S.charAt(i + 1) == 'C') {
				t[i + 1] = t[i] + 1;
			} else {
				t[i + 1] = t[i];
			}
		}
		for (int i = 0; i < Q; i += 1) {
			int l = in.nextInt();
			int r = in.nextInt();
			out.println(t[r - 1] - t[l - 1]);
		}
	}

	public static void main(String[] args) {
		exec(new Scanner(System.in), System.out);
	}

}
