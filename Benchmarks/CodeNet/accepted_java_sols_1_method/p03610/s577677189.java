import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		String[] s = sc.next().split("");
		for (int i = 0; i < s.length; i += 2)
			out.print(s[i]);
		out.flush();
	}
}