import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		long rest = n % k;
		long num = k - rest;

		long ans = Math.min(rest, num); 
		System.out.println(ans);
		sc.close();
	}
	
}