import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			int n = scanner.nextInt();
			int s = scanner.nextInt();
			
			if(n==0 && s==0)
			{
				break;
			}
			
			int count = 0;
			long init = 0;
			long exit = 0;
			for(int i=0; i<n; i++)
			{
				init += (9-i)*Math.pow(10, n-i-1);
				exit += i*Math.pow(10, i);
			}
			//System.out.println(exit + " ~ "+ init );
			for(long i=init; i>exit; i--)
			{
				int sum = 0;
				long m = i;
				long p = -1;
				boolean is_add = true;
				long[] num = new long[n];
				for(int j=n-1; j>=0; j--, m/=10)
				{
					long add = m%10;
					if(p>=add || s<sum)
					{
						is_add = false;
						break;
					}
					p = add;
					sum += add;
					num[j] = add;
				}
				if(is_add && s==sum)
				{	
				//	System.out.print(i + "=");
				//	for(int j=0; j<n; j++)
				//		System.out.print(num[j] + "+");
				//	System.out.println("");
					count ++;	
				}
			}
			
			System.out.println(count);
		}
	}
}