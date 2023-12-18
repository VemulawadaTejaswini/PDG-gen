import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[] c=new int [a];
		for(int i=0;i<b;i++)
		{
			c[i]=sc.nextInt();
		}
		System.out.println((int) Math.ceil((double) (a - b) / (b - 1) + 1));
	}
}