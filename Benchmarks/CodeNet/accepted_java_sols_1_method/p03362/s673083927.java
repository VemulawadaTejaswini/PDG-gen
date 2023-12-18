import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean[] isPrime = new boolean[555556];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for (int i = 2; i * i < 55555; i++) {
			for (int k = 2; k * i < 555556; k++) {
				isPrime[i * k] = false;
			}
		}

		int count = 0;
		int[] answer = new int[n];
		for (int i = 0; i < 555556; i++) {
			if (i % 5 == 1 && isPrime[i]) {
				answer[count++] = i;
			}
			if (count >= n) break;
		}
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}
