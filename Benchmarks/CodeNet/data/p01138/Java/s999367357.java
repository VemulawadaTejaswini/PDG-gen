import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] time = new int[86400];
		for(;;)
		{
			int N = sc.nextInt();
			if (N==0)break;
			
			Arrays.fill(time, 0);
			for (int i = 0; i < N; i++)
			{
				int s1 = toSec(sc.next()), s2 = toSec(sc.next());
				for (int s = s1; s < s2; s++) time[s]++;
			}
			int max = 0;
			for (int i = 0; i < 86400; i++) max = Math.max(max, time[i]);
			System.out.println(max);
		}
	}
	
	private static int toSec(String s)
	{
		String[] parts = s.split(":");
		int sec = 0;
		for (int i = 0; i < 3; i++)
		{
			sec = 60 * sec + Integer.parseInt(parts[i]);
		}
		return sec;
	}
}