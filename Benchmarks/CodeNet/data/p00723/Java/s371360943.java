import java.util.Scanner;
import java.util.HashSet;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			String str = sc.next();
			HashSet<String> set = new HashSet<String>();
			int length = str.length();
			for (int j = 1; j < length; j++)
			{
				String str1 = str.substring(0, j);
				String str2 = str.substring(j);
				set.add(str1 + str2);
				set.add(str1 + (new StringBuffer(str2)).reverse().toString());
				set.add((new StringBuffer(str1)).reverse().toString() + str2);
				set.add((new StringBuffer(str1)).reverse().toString()
					+ (new StringBuffer(str2)).reverse().toString());
				set.add(str2 + str1);
				set.add(str2 + (new StringBuffer(str1)).reverse().toString());
				set.add((new StringBuffer(str2)).reverse().toString() + str1);
				set.add((new StringBuffer(str2)).reverse().toString()
					+ (new StringBuffer(str1)).reverse().toString());
			}
			System.out.println(set.size());
		}
	}
}