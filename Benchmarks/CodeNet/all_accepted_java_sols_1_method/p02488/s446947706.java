import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < n; ++i)
		{
			String str = stdIn.next();
			list.add(str);
		}
		Collections.sort(list);
		System.out.println(list.get(0));
	}
}