import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		String str=s.next();
		String str2=s.next();
		
		int n=str.length();
		int len=str2.length();
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<=n-len;i++)
		{
			String temp=str.substring(i,i+len);
			
			int count=0;
			
			for(int j=0;j<temp.length();j++)
			{
				if(temp.charAt(j)!=str2.charAt(j))
				{
					count++;
				}
			}
			
			if(count<min)
				min=count;
		}
		
		System.out.println(min);
		
	}
	
}