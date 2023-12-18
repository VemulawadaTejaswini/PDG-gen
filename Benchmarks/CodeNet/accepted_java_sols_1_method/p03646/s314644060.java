import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		long k = sc.nextLong();
		
		if(k==1)
		{
			System.out.println(2);
			System.out.println("0 2");
		}
		
		
		
		
		for(long n = 2; n <= 50; n++)
		{
			long m = k%n;
			long cutk = k - ((n+1)*m);
			if(cutk < 0)continue;
			
			long typical = (n-1) + (cutk/n);
			long adv = typical + n + 1; //as much as mod
//			System.out.println("typical " + typical + ", cutn " + cutk + ", adv " + adv + ", mod " + m);
			
			if(adv > 10000000000001000l)continue;
			if(typical < 0)continue;
			
			boolean go = true;
			
			if(go)
			{
				System.out.println(n);
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < n; i++)
				{
					if(i>0)sb.append(' ');
					if(i < m)
					{
						sb.append(adv);
					}
					else
					{
						sb.append(typical);
					}
				}
				System.out.println(sb);
				return;
			}
		}
		
		
	}

}
