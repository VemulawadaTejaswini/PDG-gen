
import java.util.Scanner;

public class Main {


		public static void main(String args[])
		{
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int k=scan.nextInt();
			double ans=0;
			for(int i=1;i<=n;i++)
			{
			int t=i;
			double l=1.0/n;
			while(t<k)
			{
				t*=2;
				l/=2;
			}
			ans+=l;
				
			}
			System.out.printf("%.15f",ans);
			
		}
}
