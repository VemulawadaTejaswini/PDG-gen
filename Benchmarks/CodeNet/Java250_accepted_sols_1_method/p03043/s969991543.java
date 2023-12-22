import java.util.*;
import java.math.*;

class Main
{
	public static void main(String[] args)
	{
		int K;
		double N,n=0,m;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		BigDecimal Ans = BigDecimal.valueOf(0);
		BigDecimal One = BigDecimal.valueOf(1);
		BigDecimal num = new BigDecimal(N);
		for(int i=1;i<=N;i++)
		{
			if(i<K)
			{
				n = Math.log(K)/Math.log(2)-Math.log(i)/Math.log(2);
				n = Math.ceil(n);
				BigDecimal comp = new BigDecimal(Double.toString(Math.pow(0.5,n)));
				Ans = Ans.add(comp);
			}
			else
			{
				Ans = Ans.add(One);
			}
		}
		Ans = Ans.divide(num,12,BigDecimal.ROUND_HALF_UP);
		System.out.println(Ans);
	}
}
