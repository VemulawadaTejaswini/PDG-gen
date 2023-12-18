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
			int max = 0;
			int min = 0;
			for(int i=0; i<n; i++)
			{
				exit += (9-i)*Math.pow(10, n-i-1);
				init += i*Math.pow(10, i);
				max += (9-i);
				min += i;
			}
			if(s> max || min>s)
			{
				System.out.println(0);
				continue;
			}
			else if(s==max || s==min || s==max-1 || s==min-1 || s==max-n || s==min-n)
			{
				System.out.println(1);
				continue;
			}
			//System.out.println(exit + " ~ "+ init);
			long add = 0;
			for(long i=init; i<=exit; i++)
			{
				int sum = 0;
				long m = i;
				long p = -1;
				boolean is_add = true;
				long[] num = new long[n];
				for(int j=n-1; j>=0; j--, m/=10)
				{
					add = m%10;
					if(add+j>9 || p>=add || s<sum)
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