import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		 BigDecimal aa = new BigDecimal(n);
		int k = scan.nextInt();
		BigDecimal ab = new BigDecimal(k);
		BigDecimal a1 = new BigDecimal(1);
		int a =2;

		double result = 0;

		for(int i=1; i<=n; i++){
			a=2;

			if(i<=k-1) {
				while(a*i<k) {
					a= a*2;


				}
//				BigDecimal aaa = new BigDecimal(a);
//				double b1 = a1.divide(aa, 15, BigDecimal.ROUND_HALF_UP).doubleValue();
//				BigDecimal ab1 = new BigDecimal(b1);
//				double b2 = ab1.divide(aaa, 15, BigDecimal.ROUND_HALF_UP).doubleValue();
//				//System.out.println(b2);
				double b2 = (double)1/n/a;
				result += b2;
			}else {
				double b1 = a1.divide(aa, 15, BigDecimal.ROUND_HALF_UP).doubleValue();
				result += b1;
			}
			// System.out.println(result); 
		}
		System.out.println(result); 
	}
}