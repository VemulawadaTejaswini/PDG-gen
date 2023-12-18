import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		String str=s.next();
		
		long sum=0;
		
		for(int i=0;i<str.length();i++)
		{
			sum=sum+Integer.valueOf(str.charAt(i)+"");
		}
		
		if(sum%9==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}
	
}