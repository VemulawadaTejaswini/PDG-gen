import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(true)
		{
			int n = stdIn.nextInt();
			if(n == 0)
			{
				break;
			}
			int sum = 0;
			List<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < n; ++i)
			{
				int s = stdIn.nextInt();
				list.add(s);
				sum += s;
			}
			double average = (double)sum / n;
			double temp = 0;
			for(int i = 0; i < n; ++i)
			{
				temp += (list.get(i) - average) * (list.get(i) - average);
			}
			System.out.printf("%.8f\n", Math.sqrt(temp / n));
		}
	}
}