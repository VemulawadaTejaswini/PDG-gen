import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close(); 
		for (int i = 1; i <= 9; i++) {
			if (n % i == 0 && n / i < 10) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
	}
}