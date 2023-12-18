import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		while((n = sc.nextInt()) != 0)
		{
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < n; ++i)
			{
				int temp = sc.nextInt();
				list.add(temp);
			}
			int sum = 0;
			for(int i = 0; i < n; ++i)
			{
				sum += list.get(i);
			}
			double ave = (double)sum / n;
			double ans = 0;
			for(int i = 0; i < n; ++i)
			{
				ans += (list.get(i) - ave) * (list.get(i) - ave);
			}
			ans = Math.sqrt(ans / n);
			System.out.println(ans);
		}
	}
}