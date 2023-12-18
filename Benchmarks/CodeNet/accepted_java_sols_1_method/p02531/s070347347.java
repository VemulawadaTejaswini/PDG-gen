import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		while(true)
		{
			String s = stdIn.next();
			if(s.equals("quit"))
			{
				break;
			}
			if(s.equals("push"))
			{
				String c = stdIn.next();
				stack.add(c);
			}
			else
			{
				System.out.println(stack.pop());
			}
		}
	}
}