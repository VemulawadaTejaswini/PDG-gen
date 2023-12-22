import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int s_length = s.length();
		String s_start = s.charAt(0) + "";
		String s_end = s.charAt(s_length - 1)+ "";
		int x = s_length - 2;
		System.out.println(s_start + x + s_end);
	}
}