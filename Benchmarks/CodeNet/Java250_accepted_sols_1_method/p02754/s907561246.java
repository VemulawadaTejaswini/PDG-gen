import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long b = sc.nextLong();
		long r = sc.nextLong();
		
		if(b == 0) {
			System.out.println(0);
			return;
		}
		
		long total = b+r;
		
		long num = n/total;
		
		long amari = n%total;
		
		long ans = num*b;
		
	
		if(amari >= b) {
			ans+=b;
		} else {
			ans+=amari;
		}
		
		System.out.println(ans);

	}
}
