import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int num[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			num[i]  = scan.nextInt();
		}

		int count = 0;
		
		for (int i = 0; i < n; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= num[i] / 2; j++) {
				if (num[i] % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) count++;
		}
		
		System.out.println(count);
	}

}