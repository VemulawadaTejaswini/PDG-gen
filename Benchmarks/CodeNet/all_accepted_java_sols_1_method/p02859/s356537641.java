
import java.util.*;
import java.text.*;


public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();

		double areaOne = Math.pow(r, 2);
		double areaTwo = Math.pow(1, 2);

		double answer = areaOne / areaTwo;

		System.out.println((int)answer);
	}
}