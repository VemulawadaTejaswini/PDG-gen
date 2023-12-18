import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		List<Double> list = new ArrayList<Double>();
		while(stdIn.hasNext())
		{
			double height = stdIn.nextDouble();
			if(height == 0)
			{
				break;
			}
			list.add(height);
		}
		Collections.sort(list);
		System.out.println(list.get(list.size() - 1) - list.get(0));
	}
}