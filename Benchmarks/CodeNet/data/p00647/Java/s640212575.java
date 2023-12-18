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
			int L[]=new int[2];
			int D[]=new int[2];
			int M[]=new int[2];
			for(int i=0;i<n;i++)
			{
				String str[]=in.next().split(":");
				int h=Integer.valueOf(str[0]);
				int m1=Integer.valueOf(str[1]);
				int m2=in.nextInt();
				int cnt=0;
				if(11<=h&&h<=14)
				{
					L[0]++;
					while(m1!=m2)
					{
						m1=(m1+1)%60;
						cnt++;
					}
					if(cnt<9)
						L[1]++;
				}
				else if(18<=h&&h<=20)
				{
					D[0]++;
					while(m1!=m2)
					{
						m1=(m1+1)%60;
						cnt++;
					}
					if(cnt<9)
						D[1]++;
				}
				else if(21<=h||h<=1)
				{
					M[0]++;
					while(m1!=m2)
					{
						m1=(m1+1)%60;
						cnt++;
					}
					if(cnt<9)
						M[1]++;
				}
			}
			if(L[0]>0)
				System.out.println("lunch "+100*L[1]/L[0]);
			else System.out.println("lunch no guest");
			if(D[0]>0)
				System.out.println("dinner "+100*D[1]/D[0]);
			else System.out.println("dinner no guest");
			if(M[0]>0)
				System.out.println("midnight "+100*M[1]/M[0]);
			else System.out.println("midnight no guest");
		}
	}
}