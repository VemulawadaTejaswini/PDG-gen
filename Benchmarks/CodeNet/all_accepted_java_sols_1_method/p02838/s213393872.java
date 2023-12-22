    import java.util.*;
	import java.lang.Math;
    public class Main
	{
		//int count=0;
		/*static int xor(int x,int y)
		{
			return (x | y) & (~x | ~y);
		}*/
    	public static void main(String[] args) 
		{
    		Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			long[] a = new long[n];
			for(int i=0;i<n;i++)
			{
				a[i]=scan.nextLong();
			}
			long mod = (long) Math.pow(10,9) +7;
			
			long ans = 0;
			long base = 1;
			for (int i = 0; i <= 60; i++)
			{
				long zeroNum = 0;
				long oneNum = 0;
				for (int j = 0; j < n; j++)
				{
					long bit = ((a[j] >> i) & 1);
 
					if (bit == 0) 
						zeroNum++;
					else 
					oneNum++;
				
			}
 
			ans += (zeroNum * oneNum % mod) * (base % mod) % mod;
			ans %= mod;
			base *= 2;
		}
 
		System.out.println(ans);
 
    	}
    }