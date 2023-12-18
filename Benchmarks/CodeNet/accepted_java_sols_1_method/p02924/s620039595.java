import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		if (n == 1) {
			System.out.println(0);
			return;
		}
		
		long ans = n * (n - 1) / 2;
		System.out.println(ans);
	}
}
