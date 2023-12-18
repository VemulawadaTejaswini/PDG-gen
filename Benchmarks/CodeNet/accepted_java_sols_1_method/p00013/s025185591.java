import java.util.Scanner;
import java.util.Stack;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		
		int t;
		while(cin.hasNext())
		{
			t = cin.nextInt();
			
			if(t==0)
			{
				System.out.println(stack.pop());
			}
			else
			{
				stack.push(t);
			}
		}
	}
}