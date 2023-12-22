import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int res = 0;

		if((1 <= A && 9 >= A) && (1 <= B && 9 >= B))
		{
			res = A * B;
			System.out.println(res);
		}
		else
		{
			res = -1;
			System.out.println(res);
		}
	}
}