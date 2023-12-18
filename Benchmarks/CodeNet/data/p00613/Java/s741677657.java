import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int K = stdIn.nextInt();
			if(K == 0)
			{
				break;
			}
			int sum = 0;
			int n = K * (K - 1) / 2;
			for(int i = 0; i < n; ++i)
			{
				int a = stdIn.nextInt();
				sum += a;
			}
			System.out.println(sum / (K - 1));
		}
	}
}