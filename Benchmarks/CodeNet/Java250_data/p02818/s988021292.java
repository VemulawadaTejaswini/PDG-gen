import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long k = sc.nextLong();
		
		long takahashi = Math.max(0, a - k);
		long aoki = Math.max(0, b + Math.min(0, a - k));
		
		System.out.printf("%d %d\n", takahashi, aoki);
		sc.close();
	}
}
