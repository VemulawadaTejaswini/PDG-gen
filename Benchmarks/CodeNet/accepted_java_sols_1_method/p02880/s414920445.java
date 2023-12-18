import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int check = 1;
		if(N == 1)
			System.out.println("Yes");
		for(int i=2; i<10; i++)
		{
			int f = N%i;
			if(f == 0)
			{
				int a = N/i;
				if(a > 0 && a < 10)
				{
					check = 2;
					System.out.println("Yes");
					return;
				}
			}
			if(i == 9 && check == 1 && N != 1)
				System.out.println("No");
		}
	}
}