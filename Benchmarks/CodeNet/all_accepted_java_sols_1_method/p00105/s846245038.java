import java.util.Scanner;
import java.util.Arrays;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String words[] = new String[100];
		int pages[][] = new int[100][100];
		int last = 0;
		int pagesLast[] = new int[100];
		
		while (true)
		{
			String str;
			int n;
			try
			{
				str = sc.next();
				n = sc.nextInt();
			}
			catch (Exception e)
			{
				break;
			}
			boolean sameWords = true;
			for (int i = 0; i < last; i++)
			{
				if ((str + " " + i).equals(words[i]))
				{
					pages[i][pagesLast[i]] = n;
					pagesLast[i]++;
					sameWords = false;
					break;
				}
			}
			if (sameWords)
			{
				words[last] = str + " " + last;
				pages[last][pagesLast[last]] = n;
				pagesLast[last]++; 
				last++;
			}
		}
		
		Arrays.sort(words, 0, last);
		for (int i = 0; i < last; i++)
		{
			String str[] = words[i].split(" ");
			
			System.out.println(str[0]);
			
			int num = Integer.parseInt(str[1]);
			Arrays.sort(pages[num], 0, pagesLast[num]);
			int j;
			for (j = 0; j < pagesLast[num] - 1; j++)
			{
				System.out.print(pages[num][j] + " ");
			}
			System.out.println(pages[num][j]);
		}
	}
}