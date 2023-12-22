import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		int n = s.length();
		for (int i = 0; i < n; i++) {
			System.out.print("x");
		}
		System.out.println();
	}
}
