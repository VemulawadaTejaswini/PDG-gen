import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int[] arabia = {1, 5, 10, 50, 100, 500, 1000};
		String[] roma = {"I", "V", "X", "L", "C", "D", "M",};
		
		for(; scanner.hasNext();)
		{
			String str = scanner.next();
			
			int sum = 0;
			int prev = 0;
			for(int i=0; i<str.length(); i++)
			{
				for(int j=0; j<roma.length; j++)
				{
					if(str.substring(i, i+1).equals(roma[j]))
					{
						int add = arabia[j];
						if(prev < add)
						{
							sum -= 2*prev;
						}
						sum += add;
						prev = add;
						break;
					}
				}
			}
			
			System.out.println(sum);
		}
	}
}