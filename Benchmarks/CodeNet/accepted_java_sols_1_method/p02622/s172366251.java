import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		String str1=s.next();
		String str2=s.next();
		
		int n=str1.length();
		
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
}