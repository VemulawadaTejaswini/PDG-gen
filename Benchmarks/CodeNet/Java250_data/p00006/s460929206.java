import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		String str = stdIn.next();
		int size = str.length();
		for(int i = size - 1; i >= 0; --i)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println("");
	}
}