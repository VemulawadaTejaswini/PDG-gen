import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int x = scan.nextInt();
		boolean f = false;
		if (a <= x && a+b >= x) {
			f = true;
		}
		if (f) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
