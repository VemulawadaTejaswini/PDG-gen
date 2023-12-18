import java.util.Scanner;
import java.util.Arrays;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[,\n]");
		
		while (true)
		{
			int hands[] = new int[5];
			try
			{
				for (int i = 0; i < 5; i++)
				{
					hands[i] = sc.nextInt();
				}
			}
			catch (Exception e)
			{
				break;
			}
			Arrays.sort(hands);
			JUDGE:
			{
				int count = 0;
				
				for (int i = 0; i < 2; i++)
				{
					if (hands[i] == hands[i+1] && hands[i] == hands[i+2] && hands[i] == hands[i+3])
					{
						System.out.println("four card");
						break JUDGE;
					}
				}
				
				count = 0;
				for (int i = 0; i< 3; i++)
				{
					if (hands[0] == hands[i])
						count++;
				}
				if (count == 2 || count == 3)
				{
					int subcount = 0;
					for (int i = count; i < 5; i++)
					{
						if (hands[count] == hands[i])
							subcount++;
					}
					if (subcount == ((count == 2) ? 3 : 2))
					{
						System.out.println("full house");
						break JUDGE;
					}
				}
				
				count = 0;
				for (int i = 0; i < 5; i++)
				{
					if (hands[0] + i == hands[i])
						count++;
				}
				if (count == 5)
				{
					System.out.println("straight");
					break JUDGE;
				}
				if (hands[0] == 1 && hands[1] == 10 && hands[2] == 11 && hands[3] == 12 && hands[4] == 13)
				{
					System.out.println("straight");
					break JUDGE;
				}
				
				for (int i = 0; i< 3; i++)
				{
					if (hands[i] == hands[i+1] && hands[i] == hands[i+2])
					{
						System.out.println("three card");
						break JUDGE;
					}
				}
				
				count = 0;
				for (int i = 0; i < 5; i++)
				{
					for (int j = i + 1; j < 5; j++)
					{
						if (hands[i] == hands[j])
							count++;
						if (count == 2)
						{
							System.out.println("two pair");
							break JUDGE;
						}
					}
				}
				if (count == 1)
				{
					System.out.println("one pair");
					break JUDGE;
				}
				
				System.out.println("null");
			}
		}
	}
}