import java.util.Scanner;

public class Main
{
	public static void main(String... args)
	{
		Scanner s = new Scanner(System.in);
		int[] freq = new int[101];
		while(s.hasNextInt())
		{
			freq[s.nextInt()] += 1;
		}
		int max = 0;
		for(int i = 1; i <= 100; i++)
		{
			if(freq[i] > max)
			{
				max = freq[i];
			}
		}
		for(int i = 1; i <= 100; i++)
		{
			if(freq[i] == max)
			{
				System.out.println(freq[i]);
			}
		}
	}
}