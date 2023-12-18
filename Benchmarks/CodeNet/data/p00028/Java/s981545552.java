import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int[] count = new int[101];
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			++count[n];
		}
		int max = 0;
		for(int i = 0; i < count.length; ++i)
		{
			if(max < count[i])
			{
				max = count[i];
			}
		}
		for(int i = 0; i < count.length; ++i)
		{
			if(max == count[i])
			{
				System.out.println(i);
			}
		}
	}
}