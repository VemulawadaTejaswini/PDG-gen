import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; ++i)
		{
			int a = stdIn.nextInt();
			list.add(a);
		}
		for(int i = n - 1; i >= 1; --i)
		{
			System.out.print(list.get(i) + " ");
		}
		System.out.println(list.get(0));
	}
}