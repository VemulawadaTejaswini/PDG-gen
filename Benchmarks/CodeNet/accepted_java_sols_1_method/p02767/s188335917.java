import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++)
			a[i] = scanner.nextInt();
		int minStamina = (1 << 30);
		for(int p = 1, stamina ; p <= 100 ; p++)
		{
			stamina = 0;
			for(int i = 0 ; i < n ; i++)
				stamina += (a[i] - p) * (a[i] - p);
			minStamina = Math.min(minStamina, stamina);
		}
		System.out.println(minStamina);
		scanner.close();
	}
}