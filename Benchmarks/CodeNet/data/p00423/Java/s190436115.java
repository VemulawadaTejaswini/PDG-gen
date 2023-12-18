import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		new Main().run();		
	}
	
	private void run()
	{
		Scanner sc = new Scanner(System.in);
		int set = sc.nextInt();
		int cardA = 0;
		int cardB = 0;
		int scoreA = 0;
		int scoreB = 0;
		
		if(set == 0)
			return;
		
		for(int i = 0; i < set; ++i)
		{
			cardA = sc.nextInt();
			cardB = sc.nextInt();
			
			if(cardA == cardB)
			{
				scoreA += cardA;
				scoreB += cardB;
				continue;
			}
			
			if(cardA > cardB)
				scoreA += cardA + cardB;
			else
				scoreB += cardA + cardB;
		}
		
		System.out.println(Integer.toString(scoreA) + " " + Integer.toString(scoreB));
	}
}