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
				if(n == 1){System.out.println(0);continue;}
					for(int i = 3; i <= n; i+=2)
					{
						count = 0;
						for(int j = 3;j <= Math.sqrt(i) ;j+=2)
						{
							if(i % j == 0){count=1;break;}
						}
						
						if(count == 0)result++;
					}
				System.out.println(result+1);
			}
	}
}