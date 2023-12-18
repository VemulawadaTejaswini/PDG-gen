import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		for(int i = 0; i < 9; ++i)
		{
			String str = stdIn.next();
			int am = stdIn.nextInt();
			int pm = stdIn.nextInt();
			System.out.println(str + " " + (am + pm) + " " + (200 * am + 300 * pm));
		}
	}
}