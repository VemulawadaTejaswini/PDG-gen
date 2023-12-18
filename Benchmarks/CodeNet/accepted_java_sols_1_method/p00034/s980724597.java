import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			String[] s = stdIn.next().split(",");
			int[] l = new int[10];
			int v1 = Integer.valueOf(s[10]);
			int v2 = Integer.valueOf(s[11]);
			for(int i = 0; i < 10; ++i)
			{
				l[i] = Integer.valueOf(s[i]);
			}
			int posA = 0;
			int posB = 0;
			for(int i = 0; i < 10; ++i)
			{
				posB += l[i] * 1000;
			}
			int speedA = v1;
			int speedB = v2;
			while(posA < posB)
			{
				posA += speedA;
				posB -= speedB;
			}
			int dist = 0;
			for(int i = 0; i < 10; ++i)
			{
				dist += l[i] * 1000;
				if(posA <= dist)
				{
					System.out.println(i + 1);
					break;
				}
			}
		}
	}
}