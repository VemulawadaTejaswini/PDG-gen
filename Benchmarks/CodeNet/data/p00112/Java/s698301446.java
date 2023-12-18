import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			Arrays.sort(a);
			
			int ans=0;
			int wai=0;
			for(int i=0;i<n-1;i++)
			{
				wai+=a[i];
				ans+=wai;
			}
			System.out.println(ans);
		}
	}
}