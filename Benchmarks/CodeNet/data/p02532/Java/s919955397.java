import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		List<String> ans = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList[] list = new ArrayList[num];
		for(int i = 0; i < list.length; ++i)
		{
			list[i] = new ArrayList<String>();
		}
		String str;
		while(!(str = sc.next()).equals("quit"))
		{
			if(str.equals("pop"))
			{
				int a = sc.nextInt();
				--a;
				ans.add((String)list[a].get(list[a].size() - 1));
				list[a].remove(list[a].size() - 1);
			}
			else if(str.equals("push"))
			{
				int a = sc.nextInt();
				String c = sc.next();
				--a;
				list[a].add((String)c);
			}
			else if(str.equals("move"))
			{
				int a = sc.nextInt();
				int b = sc.nextInt();
				--a; --b;
				list[b].add(list[a].get(list[a].size() - 1));
				list[a].remove(list[a].size() - 1);
			}
		}
		Iterator<String> it = ans.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}