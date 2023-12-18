import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			long x = sc.nextLong();
			long k = sc.nextLong();
			long d = sc.nextLong();
			
			
			long ans = 0;
			long step = Math.abs(x) / d;
			long sign = x >= 0 ? 1 : -1;
//			System.out.println(step);
			if ( k <= step ) {
				ans = x - k * d * sign;
			}
			else {
				long additionalStep = k - step;
//				System.out.println("## " + additionalStep);
				if ( additionalStep % 2 == 0 ) {
					//positive case
					ans = Math.abs(x % d);
				}
				else {
//					System.out.println(x % d);
					ans = d - Math.abs(x % d);
				}
				
			}
			
			System.out.println(ans);
		}
	}

}