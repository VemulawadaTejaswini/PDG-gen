import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		String s = sc.next();
		char[] c = s.toCharArray();

		Arrays.sort(c);
		if(c[0]==c[1]&&c[2]==c[3]&&c[1]!=c[2]) out.println("Yes");
		else out.println("No");

		out.flush();
	}
}
