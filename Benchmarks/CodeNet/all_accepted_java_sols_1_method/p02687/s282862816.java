import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] a = str.toCharArray();
		if (a[1] == 'R') {
			System.out.println("ABC");
		} else {
			System.out.println("ARC");
		}

	}

}
