import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		boolean[] sieve = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			if (sieve[i] == false) {
				for (int j = i + i; j <= n; j += i) {
					sieve[j] = true;
				}
			}
		}
		int result = 0;
		for (int i = 2; i <= n; i++) {
			if (sieve[i] == false) {
				result++;
			}
		}
		System.out.println(result);
	}
}