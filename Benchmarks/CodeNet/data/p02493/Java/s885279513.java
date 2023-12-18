import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class a
{
	public static void main(String... args) throws Exception
	{
		int n = new Scanner(System.in).nextInt();
		String[] arr = new Scanner(System.in).nextLine().split(" ");
		List<String> l = Arrays.asList(arr);
		Collections.reverse(l);
		for(int i = 0; i < n; i++)
		{
			System.out.print(l.get(i));
			System.out.print(i == n - 1 ? System.getProperty("line.separator") : " ");
		}
	}
}