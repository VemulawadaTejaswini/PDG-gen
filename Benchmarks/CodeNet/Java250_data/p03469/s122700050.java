import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		char[] a = new char[10];

		for (int i = 0; i < s.length(); i++) {
			a[i] = s.charAt(i);
		}
		a[3] = '8';

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}