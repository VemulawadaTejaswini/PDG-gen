import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			int count = 0;
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<10;j++)
				{
					for(int p=0;p<10;p++)
					{
						for(int q=0;q<10;q++)
						{
							if(i+j+p+q == n) count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}