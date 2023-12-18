import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
			int n=in.nextInt();
			int k=in.nextInt();
			int a[]=new int[n];
			int d[]=new int[n-1];
			int c=0;
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			for(int i=0;i<n-1;i++)
				d[i]=a[i+1]-a[i];
			Arrays.sort(d);
			for(int i=0;i<d.length-k+1;i++)
				c+=d[i];
			System.out.println(c);
		}
	}
}