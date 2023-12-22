import java.util.HashMap;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int s0 = scanner.nextInt();
		HashMap<Integer, Object> map = new HashMap<Integer, Object>();
		for(int i = 0; i < s0; i++)
		{
			int j = scanner.nextInt();
			map.put(Integer.valueOf(j), new Object());
		}
		int s1 = scanner.nextInt();
		int c = 0;
		for(int i = 0; i < s1; i++)
		{
			int j = scanner.nextInt();
			if(map.get(Integer.valueOf(j)) != null)
			{
				c++;
			}
		}
		System.out.println(c);
	}
}