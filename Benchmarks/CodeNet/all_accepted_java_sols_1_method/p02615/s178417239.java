import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		int number = console.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();

		for(int i = 0; i < number; i ++)
		{
			a.add(console.nextInt());
		}
		
		Collections.sort(a);
		
		
		long answer = 0;
		answer += a.get(number - 1);

		for(int i = 0; i < number - 2; i ++)
		{
			answer += (a.get(number - 2 - (i / 2)));
		}
		System.out.print(answer);
	}
}
