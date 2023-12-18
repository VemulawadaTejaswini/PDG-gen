import java.util.Scanner;
import java.util.Arrays;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			int a[] = new int[3];
			for (int i = 0; i < 3; i++)
				a[i] = sc.nextInt();
			if (a[0] == 0 && a[1] == 0 && a[2] == 0) break;
			
			//Arrays.sort(a);
			int minR = a[0] * a[0] + a[1] + a[1];
			
			int n = sc.nextInt();
			for (int i = 0; i < n; i++)
			{
				int r = sc.nextInt() * 2;
				if (minR < r * r) System.out.println("OK");
				else System.out.println("NA");
			}
		}
	}
}