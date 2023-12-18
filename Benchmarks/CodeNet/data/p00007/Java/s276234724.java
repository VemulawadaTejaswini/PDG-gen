import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		long debt = 100000;
		for(int i = 0; i < n; ++i)
		{
			debt *= 1.05;
			long lessThanThousand = debt % 1000;
			if(lessThanThousand > 0)
			{
				debt += 1000 - lessThanThousand;
			}
		}
		System.out.println(debt);
	}
}