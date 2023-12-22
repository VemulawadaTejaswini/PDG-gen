import java.util.*;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		DecimalFormat df = new DecimalFormat("#,###.##");

		int N = sc.nextInt();
		int K = sc.nextInt();
		int counter = 0, hi = 0;

		for(int i = 1; i <= N; i++)
		{
			hi = sc.nextInt();
			if (hi >= K)
				counter++;
		}

		System.out.println(counter);
	}
}