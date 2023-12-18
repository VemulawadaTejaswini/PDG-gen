import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 3; ++i)
		{
			int a = stdIn.nextInt();
			list.add(a);
		}
		Collections.sort(list);
		for(int i = 0; i < list.size() - 1; ++i)
		{
			System.out.print(list.get(i) + " ");
		}
		System.out.println(list.get(list.size() - 1));
	}
}