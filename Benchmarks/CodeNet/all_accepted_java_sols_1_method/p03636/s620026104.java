import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int l = s.length();

		System.out.print(s.charAt(0));
		System.out.print(l-2);
		System.out.print(s.charAt(l-1));

	}

}
