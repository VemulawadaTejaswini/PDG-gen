import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		long k=s.nextLong();
		
		long num=0;
		
		int p=0;
		int count=0;
		
		for(int i=0;i<10000000;i++)
		{
			num=((num%k)*(10%k))%k;
			num=(num%k+7%k)%k;
			
			count++;
			
			if(num==0)
			{
				p=1;
				break;
			}
		}
		
		if(p==0)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(count);
		}
		
	}
	
}