import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		char[] oct = {'0', '1', '2', '3', '5', '7', '8', '9'};
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			if(n == 0)
			{
				break;
			}
			List<Character> list = new ArrayList<Character>();
			while(n != 0)
			{
				list.add(oct[n % 8]);
				n /= 8;
			}
			for(int i = list.size() - 1; i >= 0; --i)
			{
				System.out.print(list.get(i));
			}
			System.out.println("");
		}
	}
}