import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int N=in.nextInt();//人数(1<=i<=N)
			int T=in.nextInt();//10円玉ストレージの初期保存枚数
			int H=in.nextInt();//100円玉ストレージの初期保存枚数
			int L=in.nextInt();//10円玉ストレージの保存可能枚数(上限を超えたらbreak)
			int a[]=new int[N];//iの持つ10円の数
			int b[]=new int[N];//iの持つ100円の数
			for(int i=0;i<N;i++)
			{
				a[i]=in.nextInt();
				b[i]=in.nextInt();
			}
			int turn=0;
			int input=0;
			for(;;)
			{
				if(a[turn]==0&&b[turn]==0)
					break;
				if(a[turn]>0)
				{
					a[turn]--;
					input+=10;
					T++;
					if(T>L)
						break;
				}
				else if(b[turn]>0)
				{
					b[turn]--;
					input+=100;
					H++;
				}
				if(input>=90)
				{
					input-=90;
					while(input!=0)
					{
						a[turn]++;
						input-=10;
						T--;
					}
				}
				if(T<0)
					break;
				turn=(turn+1)%N;
			}
			System.out.println(++turn);
		}
	}
	
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}