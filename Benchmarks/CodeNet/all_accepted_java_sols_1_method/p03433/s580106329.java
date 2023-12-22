import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		boolean ans = false;
		for (int i = 0; i <= a; i++) {
			if ((n - i) % 500 == 0) {
				ans = true;
				break;
			}
		}
		System.out.println(ans ? "Yes" : "No");
	}
}
