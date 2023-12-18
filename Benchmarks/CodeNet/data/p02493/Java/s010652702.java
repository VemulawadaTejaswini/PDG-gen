import java.util.Scanner;
import java.util.Collections;
import java.util.List;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] str = sc.nextLine().split(" ");
		List list = Arrays.asList(str);
		Collections.reverse(list);
		str = list.toArrays(new String[0]);
		
		for (int i = 0; i < n; i++)
		{
			if (i == n - 1)
			{
				System.out.println(str[i]);
			}
			else
			{
				System.out.print(str[i]);
			}
		}
	}
}