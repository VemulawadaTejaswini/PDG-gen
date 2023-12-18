import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		while(sc.hasNext())
		{
			for(int i=0; i<6; i++)
				a[i]=sc.nextInt();
			boolean flag =false;

			a[2]=a[5]-a[2];
			if(a[2]<0)
			{
				a[2] = 60+a[2];
				a[1] = a[4]-a[1]-1;
				flag =true;
				if(a[1]<0)
				{
					a[1]=60+a[1];
					a[0]=a[3]-a[0]-1;
					for(int i=0; i<3; i++)
						System.out.print(a[i]+" ");
					System.out.println();
					continue;
				}
			}
			if(!flag)
				a[1]=a[4]-a[1];
			if(a[1]<0)
			{
				a[1]=60+a[1];
				a[0]=a[3]-a[0]-1;
				for(int i=0; i<3; i++)
					System.out.print(a[i]+" ");
				System.out.println();
				continue;
			}
			a[0]=a[3]-a[0];
			for(int i=0; i<3; i++)
				System.out.print(a[i]+" ");
			System.out.println();
		}
	}
}