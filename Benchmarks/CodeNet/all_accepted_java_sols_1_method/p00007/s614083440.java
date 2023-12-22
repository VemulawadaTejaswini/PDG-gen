import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int money = 100000;
		for(int i=0; i<n; i++)
		{
			money *= 1.05;
			int x = money%1000;
			if(x > 0)
			{
				money = money - x + 1000;
			}
		}
		System.out.println(money);
	}
}