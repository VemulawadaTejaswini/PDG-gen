import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		while(stdIn.hasNext())
		{
			int num = stdIn.nextInt();
			if(num == 0)
			{
				System.out.println(stack.peek());
				stack.pop();
			}
			else
			{
				stack.add(num);
			}
		}
	}
}