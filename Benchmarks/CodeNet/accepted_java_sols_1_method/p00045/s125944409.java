import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int sum = 0, items = 0, count = 0;
		while(stdIn.hasNext())
		{
			++count;
			String[] str = stdIn.next().split(",");
			int price = Integer.parseInt(str[0]);
			int num = Integer.parseInt(str[1]);
			sum += price * num;
			items += num;
		}
		System.out.println(sum);
		System.out.println((int)(items / (double)count + 0.5));
	}
}