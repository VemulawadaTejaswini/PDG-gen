import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int num = scanner.nextInt();
			int count = 0;
			if (num >= 2) {count++;}
			for(int i = 3; i <= num; i+=2) {
				if (isPrime(i)) {count++;}
			}
			System.out.println(count);
		}

	}
	
	private static boolean isPrime(int n) {
		if (n == 2) {return true;}
		if (n < 2 || n % 2 == 0) {return false;}

		for(int m = 3; m <= (int)(Math.sqrt(n)); m += 2) {
			if (n % m == 0) {return false;}
		}
		return true;
	}
}