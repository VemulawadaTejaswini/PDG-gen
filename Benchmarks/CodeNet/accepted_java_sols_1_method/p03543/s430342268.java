import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = n / 1000;
		int n2 = n % 1000 / 100;
		int n3 = n % 1000 % 100 / 10;
		int n4 = n % 1000 % 100 % 10;
		boolean ans = false;
		if (n2 == n3 && n1 == n2 || n2 == n3 && n3 == n4) {
			ans = true;
		}
		System.out.println(ans ? "Yes" : "No");
	}
}
