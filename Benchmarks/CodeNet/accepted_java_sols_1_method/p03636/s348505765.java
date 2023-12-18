import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.print(s.charAt(0));
		System.out.print(s.length()-2);
		System.out.print(s.charAt(s.length()-1));
	}
}