import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		//User Input
			int firstNum = sc.nextInt();

			int secondNum = sc.nextInt();

		//If statement
			if(firstNum <= 9 && firstNum >= 0 && secondNum >= 0 && secondNum <= 9)
			{
				int product = firstNum * secondNum;
				System.out.println(product);
			}
			else
				System.out.println("-1");
	}

}