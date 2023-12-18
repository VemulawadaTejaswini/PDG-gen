import java.util.Scanner;
public class Main{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int A=in.nextInt();
			int B=in.nextInt();
			int an[]=new int[A];
			int br[]=new int[B];
			for(int i=0;i<A;i++)
				an[i]=in.nextInt();
			for(int i=0;i<B;i++)
				br[i]=in.nextInt();

			int ans=0;
			for(int I=0;I<B;I++)//Bの開始地点
			{
				for(int i=I;i<B;i++)
				{
					int cnt=0;
					for(int j=0;j<A;j++)
					{
						if(br[i]==an[j])
						{
							cnt++;
							i++;
						}
						if(i>=B)
							break;
					}
					ans=Math.max(ans, cnt);
				}
			}
			System.out.println(ans);
		}
	}
}