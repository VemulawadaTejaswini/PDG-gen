import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int N = stdIn.nextInt();
			int A = stdIn.nextInt();
			int B = stdIn.nextInt();
			int C = stdIn.nextInt();
			int X = stdIn.nextInt();
			if(N == 0 && A == 0 && B == 0 && C == 0 && X == 0)
			{
				break;
			}
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < N; ++i)
			{
				int a = stdIn.nextInt();
				list.add(a);
			}
			int count = 0;
			int pos = 0;
			while(true)
			{
				if(list.get(pos) == X)
				{
					++pos;
				}
				if(count >= 10001)
				{
					System.out.println(-1);
					break;
				}
				if(pos >= N)
				{
					System.out.println(count);
					break;
				}
				X = (A * X + B) % C;
				++count;
			}
		}
	}
}