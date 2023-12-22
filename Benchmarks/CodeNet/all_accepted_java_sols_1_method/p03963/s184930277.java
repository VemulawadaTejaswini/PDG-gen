import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(),k = sc.nextLong();
		long ans = k;
		for(long i = 0; i < n-1; i++) {
			ans = ans * (k-1);
		}
		System.out.println(ans);
	}
}