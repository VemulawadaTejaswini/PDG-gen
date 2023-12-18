import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(true)
		{
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			if(x == 0 && y == 0)
			{
				break;
			}
			if(x <= y)
			{
				System.out.println(x + " " + y);
			}
			else
			{
				System.out.println(y + " " + x);
			}
		}
	}
}