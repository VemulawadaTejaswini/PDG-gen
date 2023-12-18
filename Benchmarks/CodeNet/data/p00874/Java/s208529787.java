import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int w=in.nextInt(),d=in.nextInt();
			if((w|d)==0)
				return;
			int front[]=new int[w];
			int side[]=new int[d];
			int cnt=0;
			for(int i=0;i<w;i++)
				front[i]=in.nextInt();
			for(int i=0;i<d;i++)
				side[i]=in.nextInt();
			
			for(int i=0;i<w;i++)
				for(int j=0;j<d;j++)
				{
					if(front[i]==side[j])
						front[i]=0;
				}
			for(int i=0;i<w;i++)
				cnt+=front[i];
			for(int i=0;i<d;i++)
				cnt+=side[i];
			System.out.println(cnt);
		}
	}
}