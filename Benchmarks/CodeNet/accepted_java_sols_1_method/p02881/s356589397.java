import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = Long.parseLong(sc.next()); 
		Long a = (long) Math.sqrt(n);		
		
		
		Long ans = 0l;
		for(long i = a ; 1 <= i ; i--) {
			if(n % i == 0 ) {
				ans = (i + n/i) - 2;
				break;
			}
		}
		
		
		System.out.println(ans);
	}
}