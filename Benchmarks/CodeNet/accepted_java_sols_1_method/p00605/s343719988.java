import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int ju=0;
			int N=in.nextInt();
			int K=in.nextInt();
			if((N|K)==0)
				return;
			int s[]=new int[K];
			for(int i=0;i<K;i++)
			s[i]=in.nextInt();
			for(int i=0;i<N;i++)
				for(int j=0;j<K;j++)
				{
					s[j]-=in.nextInt();
					if(s[j]<0)
						ju=1;
				}
			if(ju==0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}