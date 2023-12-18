import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), a, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++)
		{
			a = scan.nextInt();
			max = a > max ? a : max;
			min = a < min ? a : min;
		}
		scan.close();
		System.out.println(max - min);
		
	}
}