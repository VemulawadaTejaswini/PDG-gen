import java.util.HashMap;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		boolean[][] exist=new boolean[4][13];
		HashMap<String, Integer> hs=new HashMap<String, Integer>();
		hs.put("S", 0);
		hs.put("H", 1);
		hs.put("C", 2);
		hs.put("D", 3);
		char[] pattern=new char[4];
		pattern[0] = 'S';
		pattern[1] = 'H';
		pattern[2] = 'C';
		pattern[3] = 'D';
		
		int n=sc.nextInt();
		for(int i=0; i<n; i++)
		{
			String pat=sc.next();
			int    no =sc.nextInt();
			
			exist[hs.get(pat)][no-1]=true;
		}
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<13; j++)
			{
				if(exist[i][j] == false)
					System.out.println(pattern[i]+" "+(j+1));
			}
		}

	}
}