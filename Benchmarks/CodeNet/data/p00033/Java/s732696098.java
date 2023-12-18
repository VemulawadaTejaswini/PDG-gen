import java.util.Scanner;
public class Main
{
	static int a[]=new int[10];
	static int ans;
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0)
		{
			ans=0;
			for(int i=0;i<10;i++)
				a[i]=in.nextInt();
			solve(0,0,0);
			if(ans==1)
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
	}
	public static void solve(int l,int r,int i)
	{
		if(i==10)
		{
			ans=1;
			return;
		}
		if(l<a[i])
			solve(a[i],r,i+1);
		else if(r<a[i])
			solve(l,a[i],i+1);
	}
}