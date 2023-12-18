import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> S = new ArrayList<Integer>();
		for(int i = 0; i < n; ++i)
		{
			S.add(sc.nextInt());
		}
		int q = sc.nextInt();
		List<Integer> T = new ArrayList<Integer>();
		for(int i = 0; i < q; ++i)
		{
			T.add(sc.nextInt());
		}
		int ans = 0;
		for(int i = 0; i < n; ++i)
		{
			for(int j = 0; j < q; ++j)
			{
				if(S.get(i) == T.get(j))
				{
					++ans;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}