import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		int N = 150000;
		Scanner sc = new Scanner(System.in);
		boolean[] p = new boolean[N];
		Arrays.fill(p, true);
		List<Integer> prime = new ArrayList<Integer>();
		p[0] = p[1] = false;
		for(int i = 2; i < N; ++i)
		{
			if(p[i])
			{
				prime.add(i);
				for(int j = 2 * i; j < N; j += i)
				{
					p[j] = false;
				}
			}
		}
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			int P = stdIn.nextInt();
			if(n == -1 && P == -1)break;
			List<Integer> res = new ArrayList<Integer>();
			int k=0;
			while(prime.get(k) <= n)
			{
				k++;
			}
			for(int i = k;i < k + P; ++i)
			{
				for(int j = i;j < k + P; ++j)
				{
					res.add(prime.get(i) + prime.get(j));
				}
			}
			Collections.sort(res);
			System.out.println(res.get(P - 1));
		}
	}
}