import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		String str = stdIn.nextLine();
		char[] a = str.toCharArray();
		for(int i = 0; i < a.length; ++i)
		{
			if('a' <= a[i] && a[i] <= 'z')
			{
				a[i] += 'A' - 'a';
			}
		}
		System.out.println(a);
	}
}