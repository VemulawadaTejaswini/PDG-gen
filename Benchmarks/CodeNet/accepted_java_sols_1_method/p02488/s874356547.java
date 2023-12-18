import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i = 0; i < size; ++i)
		{
			String str = sc.next();
			list.add(str);
		}
		Collections.sort(list);
		System.out.println(list.get(0));
	}
}