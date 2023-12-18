import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int n[] = new int[N.length() + 1];
		int x = 0;
		for (int i = 0; i < N.length(); i++) {
			x += Integer.parseInt(N.substring(i, i + 1));
		}
		if (Integer.parseInt(N) % x == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}