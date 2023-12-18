import java.util.Scanner;

public class Main {
	static int maxn = 300 + 10;

	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		double a[]=new double [200000+100];
		int n=cin.nextInt();
		int k=cin.nextInt();
		a[0]=0;
		for(int i=1;i<=n;i++)
		{
			double s=cin.nextDouble();
			a[i]=a[i-1]+(s+1)/2;
			
		}
		double ans=0;
		for(int i=k;i<=n;i++)
		{
			if(a[i]-a[i-k]>ans)
				ans=a[i]-a[i-k];
		}
		System.out.println(ans);
	}

}