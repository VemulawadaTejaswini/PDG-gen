import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int ab = a + b;
		int ac = a + c;
		int bc = b + c;
		int ans = Math.min(ab, Math.min(ac, bc));
		System.out.println(ans);
	}
}