
import java.util.Scanner;

public class Main
{
	private static int[] P2 = new int[1000 + 1];
	private static int[] P3 = new int[100 + 1];
	
	public static void main(String[] args)
	{
		for (int y = 1; y <= 1000; y++) P2[y] = y * y;
		for (int z = 1; z <= 100; z++) P3[z] = z * z * z;
		
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			int E=sc.nextInt();
			if (E==0) break;
			
			int m = 1<<20;
			for (int z = 100; z >= 0; z--)
			{
				int z3 = P3[z];
				for (int y = 1000; y >= 0; y--)
				{
					int y2 = P2[y];
					int x = (E - y2 - z3);
					if (x >= 0) m = Math.min(m, x + y + z);
				}
			}
			System.out.println(m);
		}
	}
}