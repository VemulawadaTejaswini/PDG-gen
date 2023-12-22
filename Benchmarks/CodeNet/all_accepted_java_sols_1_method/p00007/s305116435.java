import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int money = 100000;
		int n = sc.nextInt();
		
		for (int i = 0; i < n ; i++)
		{
			money += money * 5 / 100;
			int a;
			if ((a = money % 1000) != 0) money = money - a + 1000; 
		}
		System.out.println(Integer.toString(money));
	}
}