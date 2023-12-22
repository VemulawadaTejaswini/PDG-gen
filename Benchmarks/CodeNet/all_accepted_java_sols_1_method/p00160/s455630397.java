import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext())
		{
			int n = sc.nextInt();
			if(n==0)
				return;
			int ans =0;
			int sum=0;
			int g=0;
			while(n-->0)
			{
				sum=sc.nextInt()+sc.nextInt()+sc.nextInt();
				g= sc.nextInt();

				if(sum>160 || g>25)
				{
					continue;
				}
				else if(sum<=60 && g<=2)
				{
					ans+=600;
					continue;
				}
				else if(sum<=80 && g<= 5)
				{
					ans+=800;
					continue;
				}
				else if(sum<=100 && g<=10)
				{
					ans+=1000;
					continue;
				}
				else if(sum<=120 && g<=15)
				{
					ans+=1200;
					continue;
				}
				else if(sum<=140 && g<=20)
				{
					ans+=1400;
					continue;
				}
				else if(sum<=160 && g<=25)
				{
					ans+=1600;
					continue;
				}

			}
			System.out.println(ans);
		}

	}

}