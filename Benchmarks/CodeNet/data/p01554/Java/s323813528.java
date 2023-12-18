import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		TreeSet<String> ID = new TreeSet<String>();
		while(n-- != 0)
		{
			String str = stdIn.next();
			ID.add(str);
		}
		int m = stdIn.nextInt();
		boolean flag = false;
		while(m-- != 0)
		{
			String str = stdIn.next();
			if(ID.contains(str))
			{
				if(flag)
				{
					System.out.println("Closed by " + str);
				}
				else
				{
					System.out.println("Opened by " + str);
				}
				flag = !flag;
			}
			else
			{
				System.out.println("Unknown " + str);
			}
		}
	}
}