import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		List<String> que = new LinkedList<String>();
		while(true)
		{
			String s = sc.next();
			if(s.equals("quit"))
			{
				break;
			}
			if(s.equals("push"))
			{
				String t = sc.next();
				que.add(t);
			}
			else if(s.equals("pop"))
			{
				System.out.println(que.get(que.size() - 1));
				que.remove(que.size() - 1);
			}
		}
	}
}