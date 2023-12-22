import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		int n, q;
		char[] input;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		q = scanner.nextInt();
		scanner.nextLine();
		input = scanner.nextLine()
					   .toCharArray();
		int[][] ranges = new int[q][2];
		for (int i = 0; i < q; i++)
		{
			ranges[i][0] = scanner.nextInt();
			ranges[i][1] = scanner.nextInt();
		}
		int[] temp = new int[n];
		int t = 0;
		for (int i = 0; i < n - 1; i++)
		{
			if (input[i] == 'A' && input[i + 1] == 'C')
			{
				t++;
			}
			temp[i + 1] = t;
		}
		for (int[] range : ranges)
		{
			System.out.println(temp[range[1] - 1] - temp[range[0] - 1]);
		}
	}
}
