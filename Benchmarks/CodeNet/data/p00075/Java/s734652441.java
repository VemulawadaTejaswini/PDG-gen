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
			num = stdIn.nextInt();
			weight = stdIn.nextDouble();
			height = stdIn.nextDouble();
			if(weight / height / height >= 25)
			{
				list.add(num);
			}
		}
		if(list.size() > 0)
		{
			for(int i = 0; i < list.size(); ++i)
			{
				System.out.println(list);
			}
		}
		else
		{
			System.out.println("該当なし");
		}
	}
}