import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int a=in.nextInt();
			int b=in.nextInt();
			int c=in.nextInt();
			if((a|b|c)==0)
				return;
			int A[]=new int[a];
			int B[]=new int[b];
			int C[]=new int[c];
			Arrays.fill(A, 2);
			Arrays.fill(B, 2);
			Arrays.fill(C, 2);
			int judge[][][]=new int[a][b][c];
			int N=in.nextInt();
			for(int I=0;I<N;I++)
			{
				int i=in.nextInt();
				int j=in.nextInt();
				int k=in.nextInt();
				int r=in.nextInt();
				judge[i-1][j-a-1][k-a-b-1]=r;
				if(r==1)
				{
					A[i-1]=1;
					B[j-a-1]=1;
					C[k-a-b-1]=1;
				}
				else 
					judge[i-1][j-a-1][k-a-b-1]=-1;
			}
			for(int i=0;i<a;i++)
				for(int j=0;j<b;j++)
					for(int k=0;k<c;k++)
					{
						if(judge[i][j][k]==-1)
						{
							if(A[i]==1&&B[j]==1&&C[k]==2)C[k]=0;
							if(A[i]==1&&B[j]==2&&C[k]==1)B[j]=0;
							if(A[i]==2&&B[j]==1&&C[k]==1)A[i]=0;
						}
					}
			for(int p:A)
				System.out.println(p);
			for(int p:B)
				System.out.println(p);
			for(int p:C)
				System.out.println(p);
		}
	}

	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}