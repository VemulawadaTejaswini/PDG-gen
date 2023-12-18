import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println(count(numbers, n));
		sc.close();
	}

	public static int count(int[] numbers, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (primeNumbers(numbers[i])) {
				count++;
			}
		}
		return count;

	}

	public static boolean primeNumbers(int num) {
		boolean flag = true;
		if (num == 2) {
			return flag;
		} else if (num % 2 == 0) {
			flag = false;
			return flag;
		} else {
			for (int i = 3; i <= Math.sqrt(num); i += 2) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			return flag;
		}

	}
}

