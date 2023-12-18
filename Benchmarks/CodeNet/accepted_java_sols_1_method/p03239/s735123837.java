import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int T = in.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0 ; i < N ; i++)
		{
			int c = in.nextInt();
			int t = in.nextInt();
			if (t <= T)
			{
				arr.add(c);
			}
		}
		if (arr.size() == 0)
		{
			System.out.println("TLE");
			return;
		}	
		int ans = arr.get(0);
		for(int i = 0; i < arr.size(); i++)
		{
			if(ans > arr.get(i))
				ans = arr.get(i);
		}
		System.out.println(ans);
	}
}