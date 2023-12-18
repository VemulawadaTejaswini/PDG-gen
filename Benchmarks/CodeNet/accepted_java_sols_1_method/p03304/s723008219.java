import java.util.*;
import java.math.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long d = sc.nextLong();
		double ans = (double)((m-1)*(n-d))/(double)(n*n);
		if(d!=0) ans *= 2;
		BigDecimal x = new BigDecimal(ans);
		System.out.printf("%.20f",x);
		return;
	}
}