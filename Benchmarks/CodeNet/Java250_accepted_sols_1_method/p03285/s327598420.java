import java.util.*;
 
public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0,c=0;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				if(i*4+j*7 == a)
					b++;
				else
					c++;
			}
		}
		if(b>0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}	
}