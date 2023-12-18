import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(true)
		{
			int m = stdIn.nextInt();
			int f = stdIn.nextInt();
			int r = stdIn.nextInt();
			if(m == -1 && f == -1 && r == -1)
			{
				break;
			}
			int sum = m + f;
			if(m == -1 || f == -1 || sum < 30)
			{
				System.out.println("F");
				continue;
			}
			if(sum >= 80)
			{
				System.out.println("A");
			}
			else if(sum >= 65)
			{
				System.out.println("B");
			}
			else if(sum >= 50)
			{
				System.out.println("C");
			}
			else if(sum >= 30)
			{
				if(r >= 50)
				{
					System.out.println("C");
				}
				else
				{
					System.out.println("D");
				}
			}
		}
	}
}