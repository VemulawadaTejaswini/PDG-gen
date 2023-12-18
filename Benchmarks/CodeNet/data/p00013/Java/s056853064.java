import java.util.ArrayList;
import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
	
		ArrayList<Integer> in = new ArrayList<Integer>();
		ArrayList<Integer> out = new ArrayList<Integer>();
		for(; scanner.hasNext();)
		{
			int n = scanner.nextInt();
			if(n == 0)
			{
				int s = in.size() -1;
				out.add(in.get(s));
				in.remove(s);
			}
			else
			{
				in.add(n);
			}
		}
		
		for(Integer id : out)
		{
			System.out.println(id);
		}
	}
}