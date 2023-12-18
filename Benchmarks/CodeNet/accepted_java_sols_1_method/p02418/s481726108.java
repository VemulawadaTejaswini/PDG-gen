import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String p = in.next();
		String s2 = s + s;
		System.out.println(s2.contains(p) ? "Yes" : "No");
	}
}
