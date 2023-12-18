import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = null;
		String search = sc.next();
		search = search.toLowerCase();
		int count = 0;
		while(!(str = sc.next()).equals("END_OF_TEXT"))
		{
			str = str.toLowerCase();
			if(str.equals(search))
			{
				++count;
			}
		}
		System.out.println(count);
	}
}