import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String ans[] = { "Yes", "No" };
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		sc.close();
		int an = ((a == b) ? (a != c) ? 0 : 1 : (a == c) ? 0 : (b == c) ? 0 : 1);
		System.out.println(ans[an]);
	}
}
