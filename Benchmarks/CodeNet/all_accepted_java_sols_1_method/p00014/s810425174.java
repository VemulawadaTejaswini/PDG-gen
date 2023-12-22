import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int d = stdIn.nextInt();
			int sum = 0;
			for(int i = d; i < 600; i += d)
			{
				sum += d * i * i;
			}
			System.out.println(sum);
		}
	}
}