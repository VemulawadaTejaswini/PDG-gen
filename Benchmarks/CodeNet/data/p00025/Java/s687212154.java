import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[4];
		int b[]=new int[4];

		while(sc.hasNext())
		{
			int hi =0;
			int bl =0;
			for(int i=0; i<4;i++)
				a[i]=sc.nextInt();
			for(int i=0; i<4;i++)
				b[i]=sc.nextInt();

			for(int i=0;i<4; i++)
				if(a[i]==b[i])
					hi++;

			for(int i=0; i<4; i++)
				for(int j=i+1; j<4; j++)
					if(a[i]==b[j])
						bl++;

			System.out.println(hi+" "+bl);
		}

	}

}