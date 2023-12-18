import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		int d=sc.nextInt();
		int a=0;
		for(int i=l;i<=r;i++)
		{
			if(i%d==0)
				a++;
		}
		System.out.println(a);
	}
}