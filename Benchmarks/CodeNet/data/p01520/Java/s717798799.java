import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int T = stdIn.nextInt();
		int E = stdIn.nextInt();
		int min = T - E;
		int max = T + E;
		List<Integer> time = new ArrayList<Integer>();
		for(int i = 0; i < N; ++i)
		{
			int t = stdIn.nextInt();
			time.add(t);
		}
		boolean okFlag = false;
		for(int i = 0; i < N; ++i)
		{
			if(okFlag)
			{
				break;
			}
			okFlag = false;
			int sum = time.get(i);
			while(sum <= max)
			{
				if(min <= sum)
				{
					System.out.println(i + 1);
					okFlag = true;
					break;
				}
				sum += time.get(i);
			}
		}
		if(!okFlag)
		{
			System.out.println(-1);
		}
	}
}