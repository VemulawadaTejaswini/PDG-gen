import java.util.ArrayList;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> number = new ArrayList<>();
		ArrayList<Integer> count = new ArrayList<>();
		
		for(int add=0; scanner.hasNext();)
		{
			int input = scanner.nextInt();
			
			boolean is_add = false;
			for(int j=0; j<add; j++)
			{
				int no = number.get(j);
				if(input == no)
				{
					count.set(j, count.get(j)+1);
				}
			}
			if(!is_add)
			{
				add++;
				count.add(1);
				number.add(input);
			}
		}
		
		for(int i=0; i<number.size(); i++)
		{
			for(int j=i+1; j<number.size(); j++)
			{
				int n = number.get(i);
				int m = number.get(j);
				if(n > m)
				{
					number.set(i, m);
					number.set(j, n);
					
					int c0 = count.get(i);
					int c1 = count.get(j);
					count.set(i, c1);
					count.set(j, c0);
				}
			}
		}
		
		int max = 0;
		for(int i=0; i<number.size(); i++)
		{
			if(max < count.get(i))
			{
				max = count.get(i);
			}
		}
		
		for(int i=0; i<number.size(); i++)
		{
			if(max == count.get(i))
			{
				System.out.println(number.get(i));
			}
		}
	}
}