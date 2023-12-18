import java.util.Scanner;

public class Main {

	public static void main(String... nui) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int sum = 0, m = n;
		
		while (m > 0) {
			
			sum += m % 10;
			m /= 10;
			
		}
		
		System.out.println((n % sum == 0) ? "Yes" : "No");
		
	}

}
