import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < 2; ++i)
			{
				list.add(sc.nextInt());
			}
			if(list.get(0) == 0 && list.get(1) == 0)
			{
				break;
			}
			Collections.sort(list);
			System.out.printf("%d %d\n", list.get(0), list.get(1));
		}
	}
}