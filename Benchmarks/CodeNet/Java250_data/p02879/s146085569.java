
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		//variables
		int num1, num2;

		//scanner
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		//deciding output
		System.out.println("");
		if(((num1 <= 9) && (num1 >=1)&&((num2 <= 9) && (num2 >=1))))
		{

			System.out.println(num1*num2);
		}
		else

			System.out.println("-1");

	}
}