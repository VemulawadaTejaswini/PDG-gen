import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int size = sc.nextInt();
		for(int i = 0; i < size; ++i)
		{
			int temp = sc.nextInt();
			list.add(temp);
		}
		Collections.sort(list);
		for(int i = 0; i < size - 1; ++i)
		{
			System.out.printf("%d ", list.get(i));
		}
		System.out.println(list.get(size - 1));
	}
}