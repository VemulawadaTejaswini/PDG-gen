import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int a[]=new int[5];
			boolean j[]=new boolean[5];
			int f=in.nextInt();
			if(f==0)
				return;
			a[0]=f;
			for(int i=1;i<5;i++)
			{
				a[i]=in.nextInt();
				j[i]=true;
			}
			int c=0;
			for(int i=0;i<5;i++)
			{
				if(a[i]==1&&j[1])
				{
					c++;
					j[1]=false;
				}
				if(a[i]==2&&j[2])
				{
					c++;
					j[2]=false;
				}
				if(a[i]==3&&j[3])
				{
					c++;
					j[3]=false;
				}
			}
			if(c==1||c==3)
				for(int i=0;i<5;i++)
					System.out.println(3);
			else
				if(j[3])
				{
					for(int i=0; i<5;i++)
						if(a[i]==1)
							System.out.println(1);
						else
							System.out.println(2);
				}
				else if(j[2])
				{
					for(int i=0; i<5;i++)
						if(a[i]==3)
							System.out.println(1);
						else
							System.out.println(2);
				}
				else if(j[1])
				{
					for(int i=0; i<5;i++)
						if(a[i]==2)
							System.out.println(1);
						else
							System.out.println(2);
				}
		}
	}
}