import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String strs[] = sc.nextLine().split(" ");
		int maxLength = 0;
		int indexL = 0;
		int maxFrequency = 0;
		int indexF = 0;
		
		for (int i = 0; i < strs.length; i++)
		{
			if (maxLength < strs[i].length())
			{
				indexL = i;
			}
			int count = 0;
			for (int j = i; j < strs.length; j++)
			{
				if (strs[i].equals(strs[j]))
				{
					count++;
				}
			}
			if (maxFrequency < count)
			{
				indexF = i;
				maxFrequency = count;
			}
		}
		System.out.println(strs[indexF] + " " + strs[indexL]);
	}
}