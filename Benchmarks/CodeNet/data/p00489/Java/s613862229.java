import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		int gameN=N*(N-1)/2;
		int winScore[]=new int[N];
		
		for(int i=0; i<gameN; i++)
		{
			int teamNoA = sc.nextInt()-1;
			int teamNoB = sc.nextInt()-1;
			int gamePointA = sc.nextInt();
			int gamePointB = sc.nextInt();
			
			if(gamePointA > gamePointB)
			{
				winScore[teamNoA] += 3;
			}
			else if(gamePointA < gamePointB)
			{
				winScore[teamNoB] += 3;
			}
			else
			{
				winScore[teamNoA] += 1;
				winScore[teamNoB] += 1;
			}
		}
		
		int[] rank=new int[N];
		for(int i=0; i<N; i++)
			rank[i] = 1;
		
		for(int i=0; i<N; i++)
		for(int j=0; j<N; j++)
			if(winScore[i] < winScore[j])rank[i]++;
		
		for(int i=0; i<N; i++)
			System.out.println(rank[i]);
	}
}