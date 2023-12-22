import java.util.Scanner;

public class Main{
	private static int N_MAX = 1000000;

	public static void main(String[] args){
		boolean[] sieve = new boolean[N_MAX];
		for (int i = 2; i < N_MAX; i++) {
			if (sieve[i] == false) {
				for (int j = i + i; j < N_MAX; j += i) {
					sieve[j] = true;
				}
			}
		}

		for (Scanner input = new Scanner(System.in); input.hasNextInt(); ) {
			int n = input.nextInt(), result = 0;
			for (int i = 2; i <= n; i++) {
				if (sieve[i] == false) {
					result++;
				}
			}
			System.out.println(result);
		}
	}
}