import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int h = sc.nextInt();

		int[] ary = new int[w];
		for (int i = 0; i < w; i++)
		{
			ary[i] = i + 1;
		}

		for (int i = 0; i < h; i++)
		{
			String ab = sc.next();
			int a = Integer.parseInt(ab.split(",")[0]) - 1;
			int b = Integer.parseInt(ab.split(",")[1]) - 1;

			int temp = ary[a];
			ary[a] = ary[b];
			ary[b] = temp;
		}

		for (int a :
				ary)
		{
			System.out.println(a);
		}
	}
}

