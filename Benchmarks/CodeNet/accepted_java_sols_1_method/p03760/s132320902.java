import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, b;
		a = sc.next();
		b = sc.next();

		String ans = "";
		int len = Math.max(a.length(), b.length());
		for (int i = 0; i < len; i++) {
			if(i <= a.length() - 1) ans += a.charAt(i);
			if(i <= b.length() - 1) ans += b.charAt(i);
		}

		System.out.print(ans);
	}
}