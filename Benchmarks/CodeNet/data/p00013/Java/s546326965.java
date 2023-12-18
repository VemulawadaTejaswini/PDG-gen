import java.util.Scanner;
import java.util.Stack;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> st = new Stack<Integer>();
		
		while (true)
		{
			try
			{
				int num = sc.nextInt();
				
				if (num == 0)
				{
					System.out.println(st.pop());
				}
				else
				{
					st.push(num);
				}
			}
			catch (Exception e)
			{
				break;
			}
		}
	}
}