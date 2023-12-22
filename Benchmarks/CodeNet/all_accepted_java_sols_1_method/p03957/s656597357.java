import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int c = s.indexOf('C');
		int f = s.indexOf('F', c + 1);
		if (c != -1 && f != -1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
