import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int A = stdIn.nextInt();
			int B = stdIn.nextInt();
			if(A == 0 && B == 0)
			{
				break;
			}
			int sum = B - A;
			int thousand, fiveHundred, hundred;
			thousand = sum / 1000;
			sum %= 1000;
			fiveHundred = sum / 500;
			sum %= 500;
			hundred = sum / 100;
			System.out.println(hundred + " " + fiveHundred + " " + thousand);
		}
	}
}