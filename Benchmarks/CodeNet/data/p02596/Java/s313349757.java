import java.util.*;
public class Main 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		boolean f=true;
		if(k%2==0||k%5==0) 
		{
			System.out.println(-1);
			f=false;
		}
		String s="7";
		int count=1;
		while(Integer.parseInt(s)<=777777) 
		{
			int l=Integer.parseInt(s);
			if(l%k==0) 
			{
				System.out.println(count);
				break;
			}
			else 
			{
				count++;
				s=s+"7";
			}
		}
	}
}
