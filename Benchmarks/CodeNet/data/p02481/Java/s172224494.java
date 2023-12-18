import java.util.*;

public class Main
{

	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y= sc.nextInt();

		int ans0 = x * y;
		int ans1 = (x + y) * 2;

		System.out.println(ans0 + " " + ans1);


	}