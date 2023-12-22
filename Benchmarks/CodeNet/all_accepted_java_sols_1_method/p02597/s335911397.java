import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		char a[]=s.toCharArray();
		int i=0;
		int j=n-1;
		int count=0;
		int flag=0;
		int flag2=0;
		int flag3=0;
		while(i<=j)
		{
			
			while(a[i]=='R'&&i<j)
			{
				
				i++;
			}
			if(i==n-1)
			{
				break;
			}
			while(a[j]=='W'&&i<j)
			{
				
				j--;
			}
			if(j==0)
			{
				break;
			}
			
			if(i<j)
			{
			char c=a[i];
			a[i]=a[j];
			a[j]=c;
		
			count++;
			
			
			i++;
			j--;
			}
			if(i==j)
			{
				break;
			}
		}
		System.out.println(count);
	}

}
