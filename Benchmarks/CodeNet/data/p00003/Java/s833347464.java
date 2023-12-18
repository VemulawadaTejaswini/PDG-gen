import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		final int N = in.nextInt();
		
		for (int i = 0; i < N; i++) {
			solve();
		}
	}
	
	public static void solve() {
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if (c*c == a*a + b*b ||
			b*b == a*a + c*c ||
			a*a == b*b + c*c) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	}
}