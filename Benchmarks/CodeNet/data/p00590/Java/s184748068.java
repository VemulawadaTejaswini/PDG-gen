import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int num = scanner.nextInt();
			int pair = 0;
			for(int i = 1; i <= num; i++) {
				if (isPrime(i) && isPrime(num-i+1)) {
					pair++;
				}
			}
			System.out.println(pair);
		}
	}

	private static boolean isPrime(int n) {
		if (n == 1) return false;
		if (n == 2) return true;
		if (n % 2 == 0) return false;
		
		for(int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0) return false;
		}
		return true;
	}
}