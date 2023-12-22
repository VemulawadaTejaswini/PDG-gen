import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			long x = sc.nextLong();
			long k = sc.nextLong();
			long d = sc.nextLong();
			
			
			long ans = 0;
			long step = Math.abs(x) / d;
			x = Math.abs(x);

			if ( k <= step ) {
				ans = x - k * d;
			}
			else {
				long additionalStep = k - step;
				if ( additionalStep % 2 == 0 ) {
					//can go minimum
					ans = x % d;
				}
				else {
					//should go opposite side
					ans = d - x % d;
				}
				
			}
			
			System.out.println(ans);
		}
	}

}