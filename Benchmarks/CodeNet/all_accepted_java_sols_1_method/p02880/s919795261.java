import java.util.*;

public class Main
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);

		int n = sc.nextInt();

		boolean[] nums = new boolean [82];

		for (int i=1; i<=9; i++)
		{
			for (int a=1; a<=9; a++)
			{
				nums[a*i] = true;
			}
		}

		if (n > 81)
			System.out.println ("No");
		else if (nums[n])
			System.out.println ("Yes");
		else
			System.out.println ("No");



	}
}