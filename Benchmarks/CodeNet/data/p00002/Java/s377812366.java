import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int sum = a + b;
			int count = 0;
			while(sum != 0)
			{
				sum /= 10;
				++count;
			}
			System.out.println(count);
		}
	}
}