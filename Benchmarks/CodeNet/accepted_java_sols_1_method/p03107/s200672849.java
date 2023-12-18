import java.util.*;

public class Main
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		int n = str.length();
		int red = 0;
		int blue = 0;

		//0=red	1=blue

			for (int i = 0; i < n; i++)
			{
				if (str.substring (i,i+1).equals ("0"))
					red++;
				else
					blue++;
			}

		int ans = 0;
		if (red>blue)
			ans = n-(red-blue);
		else
			ans = n-(blue-red);
		System.out.println (ans);
	}
}