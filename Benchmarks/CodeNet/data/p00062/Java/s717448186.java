import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			String input = scanner.next();		
			ArrayList<Integer> n = new ArrayList<>();
			
			for(int i=0; i<input.length(); i++)
			{
				n.add(Integer.parseInt(input.substring(i, i+1)));
			}
			
			
			for(; ;)
			{
				ArrayList<Integer> m = new ArrayList<>();
				for(int i=0; i<n.size()-1; i++)
				{
					m.add((n.get(i)+n.get(i+1))%10);
				}
				
				n = m;
				if(m.size() == 1)
				{
					System.out.println(m.get(0));
					break;
				}
			}
		}
	}
}