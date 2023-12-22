import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int maxn = 100 + 10;
	static int a[];
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		int n=cin.nextInt();
		a=new int[maxn];
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			a[i]=cin.nextInt();
			sum+=a[i];
		}
		int ans1=0;
		int temp=sum/n;
		for(int i=1;i<=n;i++)
		{
			ans1+=(temp-a[i])*(temp-a[i]);
		}
		
		
		int ans=ans1;
		temp=sum/n-1;
		ans1=0;
		for(int i=1;i<=n;i++)
		{
			ans1+=(temp-a[i])*(temp-a[i]);
		}
		ans=Math.min(ans, ans1);
		
		temp=sum/n+1;
		ans1=0;
		for(int i=1;i<=n;i++)
		{
			ans1+=(temp-a[i])*(temp-a[i]);
		}
		ans=Math.min(ans, ans1);
		System.out.println(ans);
	}
	
}