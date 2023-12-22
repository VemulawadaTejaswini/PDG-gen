import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int M=100000;
		for(;;)
		{
			int n=in.nextInt();
			int a[][]=new int[11][11];
			int ans[]=new int[11];
			int A=M;
			int Ai=-1;
			Arrays.fill(ans, 0);
			for(int i=0;i<11;i++)
				Arrays.fill(a[i], M);
			if(n==0)
				return;
			for(int i=0;i<n;i++)
			{
				int s=in.nextInt();
				int t=in.nextInt();
				int d=in.nextInt();
				a[s][t]=d;
				a[t][s]=d;
			}
			for(int I=0;I<11;I++)
			{
				int p=0;
				int leng[]=new int[11];// minimum distance
				int v[] = new int[11];// decision flag
				int start =I;
				for(int k=0;k<11;k++)
				{
					leng[k]=M;
					v[k]=0;
				}
				leng[start]=0;
				for(int j=0;j<11;j++)
				{
					int min=M;//最小の節点を探す
					for(int k=0;k<11;k++)
					{
						if(v[k]==0&&leng[k]<min)
						{
							p=k;
							min=leng[k];
						}
					}
					v[p]=1;//確定フラグ
					for(int k=0;k<11;k++)
					{
						if((leng[p]+a[p][k])<leng[k])
						{
							leng[k]=leng[p]+a[p][k];
						}
					}
				}
				for(int i=0;i<11;i++)
				{
					if(leng[i]<M)
					{
						ans[start]+=leng[i];
					}
				}
				if(ans[start]<A&&ans[start]!=0)
				{
					A=ans[start];
					Ai=I;
				}
			}
			System.out.println(Ai+" "+A);
		}
	}
}