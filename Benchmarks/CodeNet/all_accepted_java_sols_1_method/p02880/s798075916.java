import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n <= 9) {
			System.out.println("Yes");
			return;
		}
		for(int i = 2; i <= 9; i++) {
			if(n % i == 0 && n / i <= 9) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}

}
