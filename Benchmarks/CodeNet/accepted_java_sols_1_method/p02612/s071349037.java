import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long p=1000;
		if(n%1000==0)
		{
			System.out.println("0");
		    return;
		}
		else
		{
		for(int i=0;i<100000;i++)
		{
			if(p>n)
			{
				System.out.println(p-n);
				break;
			}
			else
			{
				p=p+1000;
			}
		}
		}
	}

}
