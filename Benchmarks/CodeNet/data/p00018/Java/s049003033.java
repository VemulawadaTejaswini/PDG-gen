import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int[] ary = new int[5];
		for (int i = 0; i < 5; i++) {
			ary[i] = si();
		}
		Arrays.sort(ary);
		for (int i = 4; i >=0 ; i--) {
			out.print(ary[i] + (i==0 ? "" : " "));
		}
		out.println();
		out.flush();
	}

	static int si() {
		return Integer.parseInt(scan.next());
	}
}