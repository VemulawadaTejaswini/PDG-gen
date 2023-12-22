import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int a =2;

		double result = 0;

		for(int i=1; i<=n; i++){
			a=2;

			if(i<=k-1) {
				while(a*i<k) {
					a= a*2;


				}
				double b2 = (double)1/n/a;
				result += b2;
			}else {
				//double b1 = a1.divide(aa, 15, BigDecimal.ROUND_HALF_UP).doubleValue();
				double b1 = (double)1/n;
				result += b1;
			}
			// System.out.println(result); 
		}
		System.out.println(result); 
	}
}