import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		ArrayList<Stack<String> > stack = new ArrayList<Stack<String> >(n);
		for(int i = 0; i < n; ++i)
		{
			stack.add(new Stack<String>());
		}		
		while(true)
		{
			String str = stdIn.next();
			if(str.equals("quit"))
			{
				break;
			}
			if(str.equals("push"))
			{
				int a = stdIn.nextInt();
				String c = stdIn.next();
				stack.get(a - 1).add(c);
			}
			else if(str.equals("move"))
			{
				int a = stdIn.nextInt();
				int b = stdIn.nextInt();
				stack.get(b - 1).add(stack.get(a - 1).pop());
			}
			else if(str.equals("pop"))
			{
				int a = stdIn.nextInt();
				System.out.println(stack.get(a - 1).pop());
			}
		}
	}
}