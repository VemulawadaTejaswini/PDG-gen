import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		boolean ans = true;
		if (x - a >= b || a > x) {
			ans = false;
		}
		System.out.println(ans ? "YES" : "NO");
	}

}