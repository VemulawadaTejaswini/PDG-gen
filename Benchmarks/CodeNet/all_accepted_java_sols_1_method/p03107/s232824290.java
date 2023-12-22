import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		int b = s.replaceAll("0", "").length();
		int r = s.length()-b;
		System.out.println(s.length()-Math.abs(b-r));
		scn.close();
	}
}