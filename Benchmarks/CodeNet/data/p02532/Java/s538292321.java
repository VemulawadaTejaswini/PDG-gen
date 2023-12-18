import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Stack<String> > stack = new ArrayList<Stack<String> >(n);
        for(int i = 0; i < n; ++i)
        {
            stack.add(new Stack<String>());
        } 
		while(true)
		{
			String s = sc.next();
			if(s.equals("quit"))
			{
				break;
			}
			if(s.equals("push"))
			{
				int target = sc.nextInt();
				String c = sc.next();
				stack.get(target - 1).add(c);
			}
			else if(s.equals("pop"))
			{
				int target = sc.nextInt();
				System.out.println(stack.get(target - 1).pop());
			}
			else if(s.equals("move"))
			{
				int from = sc.nextInt();
				int to = sc.nextInt();
				stack.get(to - 1).add(stack.get(from - 1).pop());
			}
		}
	}
}