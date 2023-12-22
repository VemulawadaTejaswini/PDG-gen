import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int count = 1;
		while(true)
		{
			int a = stdIn.nextInt();
			if(a == 0)
			{
				break;
			}
			System.out.println("Case " + count + ": " + a);
			++count;
		}
	}
}