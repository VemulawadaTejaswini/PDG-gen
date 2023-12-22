import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int cnt = 0;
		while(n != 0)
		{
			n /= k;
			++cnt;
		}
		System.out.println(cnt);
	}
}