import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n,m;
		int edge[][]=new int[15][15];
		int a[][]=new int[205][205];
		n=in.nextInt();
		m=in.nextInt();
		for(int i=0;i<=9;i++)
			for(int j=0;j<=9;j++)
				edge[i][j]=in.nextInt();
		for(int k=0;k<=9;k++)
			for(int i=0;i<=9;i++)
                for(int j=0;j<=9;j++)
                	edge[i][j]=Math.min(edge[i][j],edge[i][k]+edge[k][j]);
		long ans=0;
		for(int i=1;i<=n;i++)
			for(int j=1;j<=m;j++)
			{
				a[i][j]=in.nextInt();
				if(a[i][j]!=-1)ans+=edge[a[i][j]][1];
			}
		System.out.println(ans);
	}
}