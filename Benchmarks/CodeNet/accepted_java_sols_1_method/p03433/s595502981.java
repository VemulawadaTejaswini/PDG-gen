import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			
			int x = n / 500;
			if (a >= n - x * 500) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}