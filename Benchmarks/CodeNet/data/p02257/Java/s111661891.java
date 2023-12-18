import java.util.Scanner;

public class Main {
	public static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int getNumPrimes(int[] list) {
		int result = 0;
		
		for (int i = 0; i < list.length; i++) {
			if (isPrime(list[i])) {
				result++;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int inputSize = scanner.nextInt();
		int[] input = new int[inputSize];
		for (int i = 0; i < inputSize; i++) {
			input[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println(getNumPrimes(input));
	}
}
