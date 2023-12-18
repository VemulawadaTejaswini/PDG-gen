import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A =sc.next();
		String B =sc.next();
		String C =sc.next();
		System.out.print((char)(A.charAt(0)+'A'-'a'));
		System.out.print((char)(B.charAt(0)+'A'-'a'));
		System.out.print((char)(C.charAt(0)+'A'-'a'));
	}
}