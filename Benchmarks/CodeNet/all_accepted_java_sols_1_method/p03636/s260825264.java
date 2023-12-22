import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char cf = s.charAt(0);
		char cl = s.charAt(s.length()-1);
		int n = s.length()-2;
		System.out.print(cf);
		System.out.print(n);
		System.out.println(cl);
	}
}
