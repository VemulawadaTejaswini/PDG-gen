import java.util.*;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		DecimalFormat df = new DecimalFormat("#,###.##");

		int N = sc.nextInt(), counter = 0;
		double pobobility = 0;

		for(int i = 0; i <= N; i++)
		{
			if (!(i%2==0))
				pobobility++;
		}
		pobobility = pobobility / N;

		System.out.println(pobobility);

	}
}