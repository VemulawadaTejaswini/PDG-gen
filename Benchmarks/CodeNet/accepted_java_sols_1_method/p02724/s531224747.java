import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		
		long money = sc.nextLong();
		
		long totalMoney = 0;
		
		long fiveHundredCoin = money/500;
		totalMoney = fiveHundredCoin * 1000;
		long remaining = money%500;
		
		long fiveCoin = remaining/5;
		totalMoney += fiveCoin * 5;
		
		System.out.println(totalMoney);
		
		

	}

}
