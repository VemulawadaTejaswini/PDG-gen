import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			
			int N = scan.nextInt();
			long[]a= new long[N];
			long goukei = 1;
			long S = (long)1e18;
			
			for(int i = 0;i<N;i++) {
				a[i] = scan.nextLong();
				
				if(a[i]==0) {
					System.out.println(0);
					System.exit(0);
				}
			}
			
			BigDecimal ans = new BigDecimal(1);
			BigDecimal jou = new BigDecimal(S);
			
		
			
			for(int i = 0;i<N;i++) {
				ans = ans.multiply(new BigDecimal(a[i]));
				int p = ans.compareTo(jou);
				
				if(p>0) {
					System.out.println(-1);
					System.exit(0);
				}
				
			}
			
			
			
			System.out.println(ans.longValue());
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
	}
		

}
