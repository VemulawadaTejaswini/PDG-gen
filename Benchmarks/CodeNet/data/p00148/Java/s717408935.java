import java.util.Scanner;

public class Main{
	public static void main(String srgs[]) {
		Scanner sc = new Scanner(System.in);
		int n;

		while (sc.hasNext()) {
			n = sc.nextInt();
			String s = "3C";
			String s2 = "0";
			n %= 39;
			n = (n == 0) ? 39 : n;
			s += (0 <= n && n <= 9) ? s2 + Integer.toString(n) : Integer.toString(n);
			System.out.println(s);
		}
	}
}