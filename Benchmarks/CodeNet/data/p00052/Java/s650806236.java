import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int num = stdIn.nextInt();
			if(num == 0)
			{
				break;
			}
			List<Integer> list = new ArrayList<Integer>();
			int multipleOfFive = 5;
			while(num >= multipleOfFive)
			{
				list.add(multipleOfFive);
				multipleOfFive *= 5;
			}
			int ans = 0;
			for(int i = 0; i < list.size(); ++i)
			{
				ans += num / list.get(i);
			}
			System.out.println(ans);
		}
	}
}