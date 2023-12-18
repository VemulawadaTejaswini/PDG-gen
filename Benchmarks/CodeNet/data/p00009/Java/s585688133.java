import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			while(sc.hasNext())
			{
				int n = sc.nextInt();
				int count = 0;
				int result = 0;
					for(int i = 2; i < n+1;i++)
					{
						count = 0;
						for(int j = i;j != 0 ;j--)
						{
							if(i % j == 0)count++;
						}
						
						if(count == 2)result++;
					}
				System.out.println(result);
			}
	}
}