import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		
		int n,t;
		int[] data = new int[3];

		n = cin.nextInt();
		while(n-- > 0)
		{
			for(int i=0; i<3; i++)
			{
				t = cin.nextInt();
				data[i] = t*t;
			}
			Arrays.sort(data);
			
			if(data[0]+data[1] == data[2])
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}