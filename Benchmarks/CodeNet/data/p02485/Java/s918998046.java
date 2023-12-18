import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(true)
		{
			String str = stdIn.next();
			if(str.equals("0"))
			{
				break;
			}
			int count = 0;
			for(int i = 0; i < str.length(); ++i)
			{
				count += str.charAt(i) - '0';
			}
			System.out.println(count);
		}
	}
}