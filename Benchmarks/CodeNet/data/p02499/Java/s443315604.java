import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			String input;
			int count = 0;
			int[] nums = new int[26];
			Arrays.fill(nums, 0);

			outer:
			while(true)
			{
				input = sc.next();
				input = input.toLowerCase();

				for(int i = 0; i < input.length(); i++)
				{
					if(input.charAt(i) == '.' || count >= 1200)
					{
						break outer;
					}
					nums[input.charAt(i) - 'a']++;
					count++;
				}
			}

			for(int i = 0; i < 26; i++)
			{
				System.out.println((char)(i + 'a') + " : " + nums[i]);
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}