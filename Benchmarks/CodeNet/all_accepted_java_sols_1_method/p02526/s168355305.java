import java.util.*;
public class Main 
{	
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; ++i)
		{
			int temp = sc.nextInt();
			list1.add(temp);
		}
		Collections.sort(list1);
		int q = sc.nextInt();
		int c = 0;
		for (int i = 0; i < q; i++)
		{
			int t = sc.nextInt();
			int j = 0;
			while (j < n && t >= list1.get(j))
			{
				if (t == list1.get(j))
				{
					c++;
					break;
				}
				j++;
			}
		}
		System.out.println(c);

	}
}