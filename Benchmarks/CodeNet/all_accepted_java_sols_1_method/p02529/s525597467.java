import java.util.*;
public class Main 
{	
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; ++i)
		{
			int temp = sc.nextInt();
			list1.add(temp);
		}
		Collections.sort(list1);
		int m = sc.nextInt();
		for(int i = 0; i < m; ++i)
		{
			int temp = sc.nextInt();
			list2.add(temp);
		}
		Collections.sort(list2);
		int count = 0;
		for(int i = 0; i < m; ++i)
		{
			for(int j = 0; j < n; ++j)
			{
				if(list1.get(j) == list2.get(i))
				{
					++count;
					break;
				}
			}
		}
		System.out.println(count);
	}
}