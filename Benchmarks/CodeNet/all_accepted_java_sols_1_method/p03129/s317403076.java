import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		int k = sc.nextInt();

		if((n + 1) / 2 >= k) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}