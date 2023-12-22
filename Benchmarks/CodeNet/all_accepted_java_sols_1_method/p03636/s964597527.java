import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
		char a = s.charAt(0);
		int b = s.length()-2;
		char c = s.charAt(s.length()-1);
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);

	}

}