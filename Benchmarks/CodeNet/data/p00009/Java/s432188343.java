import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args)
	{
		final int MAXNUM = 1000000;		
		int[] ptable = new int[MAXNUM];
		Arrays.fill(ptable, 1);
		ptable[0]=ptable[1]=0;
		
		for(int i=2; i*i<MAXNUM; i++)
		{
			if(ptable[i] == 1)
			for(int j=i*i; j<MAXNUM; j+=i)
			{
				ptable[j]=0;
			}
		}
		
		int num = 0;
		for(int i=0; i<MAXNUM; i++)
		{
			num+=ptable[i];
			ptable[i] = num;
		}
		
		Scanner cin = new Scanner(System.in);
		
		while(cin.hasNext())
		{
			num = cin.nextInt();
			System.out.println(ptable[num]);
		}
	}
}