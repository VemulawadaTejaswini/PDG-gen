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
			int num[]=new int[n];
			int p[]=new int[n];
			int q[]=new int[n];
			int r[]=new int[n];
			int cal[]=new int[n];
			int j=0;
			for(int i=0;i<n;i++)
			{
				num[i]=in.nextInt();
				p[i]=in.nextInt();
				q[i]=in.nextInt();
				r[i]=in.nextInt();
				cal[i]=p[i]*4+q[i]*9+r[i]*4;
			}
			int P=in.nextInt(),Q=in.nextInt(),R=in.nextInt(),C=in.nextInt();
			for(int i=0;i<n;i++)
			{
				if(p[i]<=P&&q[i]<=Q&&r[i]<=R&&cal[i]<=C)
				{
					System.out.println(num[i]);
					j=1;
				}
			}
			if(j==0)
				System.out.println("NA");
		}
	}
}