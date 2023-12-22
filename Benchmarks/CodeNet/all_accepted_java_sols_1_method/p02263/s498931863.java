import java.util.Scanner;
import java.util.Stack;

public class Main{
	public static void main(String[] args)
	{
		Stack<Integer> s1 = new Stack<>();
		Scanner in1 = new Scanner(System.in);
		Scanner in = new Scanner(in1.nextLine());
		while(in.hasNext())
		{
			if(in.hasNextInt())
			{
				s1.push(in.nextInt());
			}else
			{
				String symbol = in.next();	
				
				if(symbol.equals("-"))
				{
					int val1 = s1.pop();
					int val2 = s1.pop();
					s1.push(val2 - val1);
				}else if(symbol.equals("+"))
				{
					s1.push(s1.pop() + s1.pop());
				}else if(symbol.equals("*"))
				{
					s1.push(s1.pop() * s1.pop());
				}
			}
			//System.out.println(s1.peek());
		}
		System.out.println(s1.pop());
		in.close();
	}
}

