

import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean flag = false;


		if(N >= 1 && N<= 81)
		{
			for(int i = 1; i<=9; i++)
			{
				if( ((N%i) == 0) && ((N/i) <= 9))
					flag = true;
			}
		}

		if(flag == true)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

}