import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt(),m=in.nextInt(),a=in.nextInt();
			if((n|m|a)==0)
				return;
			int A[][]=new int[1001][n+1];
			int sh=1;
			int sw=a;
			for(int i=0;i<m;i++)
			{
				int h=in.nextInt();
				int p=in.nextInt();
				int q=in.nextInt();
				sh=Math.max(sh,h);
				A[h][p]=q;
				A[h][q]=p;
			}
			for(;;)
			{
				if(A[sh][sw]!=0)
					sw=A[sh][sw];
				sh--;
				if(sh==0)
					break;
			}
			System.out.println(sw);
		}
	}
}