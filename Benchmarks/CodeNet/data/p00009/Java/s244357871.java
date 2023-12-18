import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		boolean[] sieve = new boolean[N + 1];
		for (int i = 2; i <= N; i++) {
			if (sieve[i] == false) {
				for (int j = i + i; j <= N; j += i) {
					sieve[j] = true;
				}
			}
		}
		int result = 0;
		for (boolean n : sieve) {
			if (n == false) {
				result++;
			}
		}
		System.out.println(result - 2);
	}
}