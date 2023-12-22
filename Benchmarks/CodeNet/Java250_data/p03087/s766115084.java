import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static void exec(Scanner in, PrintStream out) {
		in.nextInt();
		int Q = in.nextInt();
		String S = in.next();
		List<Integer> found = new ArrayList<>();
		for (int i = 0; i < S.length();) {
			int r = S.indexOf("AC", i);
			if (r >= 0) {
				found.add(r);
				i = r + "AC".length();
			} else {
				break;
			}
		}
		for (int i = 0; i < Q; i += 1) {
			int l = in.nextInt();
			int r = in.nextInt();
			int begin = Collections.binarySearch(found, l - 1);
			if (begin < 0) {
				begin = -(begin + 1);
			}
			int end = Collections.binarySearch(found, r - 1);
			if (end < 0) {
				end = -(end + 1);
			}
			out.println(end - begin);
		}
	}

	public static void main(String[] args) {
		exec(new Scanner(System.in), System.out);
	}

}
