import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int num;
		double weight, height;
		while(stdIn.hasNext())
		{
			String[] s = stdIn.next().split(",");
			num = Integer.parseInt(s[0]);
			weight = Double.parseDouble(s[1]);
			height = Double.parseDouble(s[2]);
			if(weight / height / height >= 25)
			{
				list.add(num);
			}
		}
		if(list.size() > 0)
		{
			for(int i = 0; i < list.size(); ++i)
			{
				System.out.println(list.get(i));
			}
		}
		else
		{
			System.out.println("該当なし");
		}
	}
}