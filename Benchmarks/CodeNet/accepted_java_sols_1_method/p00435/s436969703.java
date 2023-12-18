import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		char[] c = stdIn.next().toCharArray();
		for(int i = 0; i < c.length; ++i)
		{
			if(c[i] <= 'C')
			{
				c[i] += -3 + 26;
			}
			else
			{
				c[i] -= 3;
			}
			System.out.print(c[i]);
		}
		System.out.println("");
	}
}