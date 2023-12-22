
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int a[] = new int[3], cost = 0;
		for (int i = 0; i < 3; i++)
		{
			a[i] = scan.nextInt();
		}
		scan.close();
		java.util.Arrays.sort(a);
		cost += a[1] - a[0];
		cost += a[2] - a[1];
		System.out.println(cost);
	}
}

