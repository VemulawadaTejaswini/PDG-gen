import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int N=in.nextInt();
			int A=in.nextInt(),B=in.nextInt(),C=in.nextInt();
			int X=in.nextInt();
			if((N|A|B|C|X)==0)
				return;
			int f=0;
			int j=0;
			int Y=in.nextInt();
			if(Y!=X)
				for(int i=0;i<N;i++)
				{
					if(i!=0)
					Y=in.nextInt();
					if(j==0)
						for(;;)
						{
							X=(A*X+B)%C;
							f++;
							if(X==Y)
								break;
							if(f>10000)
							{
								j=1;
								break;
							}
						}

				}
			System.out.println(f>10000 ? -1:f);
		}
	}
}