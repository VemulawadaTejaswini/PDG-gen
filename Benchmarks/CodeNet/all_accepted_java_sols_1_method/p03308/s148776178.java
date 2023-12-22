import java.util.*;
 
public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int d=0;
		int a=sc.nextInt();
		int b[]=new int [a];
		for(int i=0;i<a;i++)
		{
			b[i]=sc.nextInt();
		}
		Arrays.sort(b);
		for(int j=0;j<a;j++)
		{
			d=(b[a-1]-b[0]);
		}
		System.out.println(d);
	}
}