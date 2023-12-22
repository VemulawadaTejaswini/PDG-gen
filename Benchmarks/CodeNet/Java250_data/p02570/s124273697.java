
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
			solve();
		
	}

	public static void solve() {
		int d = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
		if (t * s >= d)
			System.out.println("Yes");
		else
			System.out.println("No");
		System.out.println();

	}
}
