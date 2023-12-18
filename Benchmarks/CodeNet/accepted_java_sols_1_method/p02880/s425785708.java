import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ans = false;
		for (int i = 9; i > 0; i--) {
			if (n%i==0) {
				if (n/i < 10) {
					ans = true;
				}
			}
		}


		if (ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
