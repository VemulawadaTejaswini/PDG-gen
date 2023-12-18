import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int set;
		int cardA = 0;
		int cardB = 0;
		int scoreA = 0;
		int scoreB = 0;
		String[] cards;
		ArrayList<String> result = new ArrayList<String>();

		for (;;)
		{
			set = Integer.parseInt(br.readLine());
			if (set == 0)
				break;

			scoreA = scoreB = 0;
			for (int i = 0; i < set; ++i)
			{
				cards = br.readLine().split(" ");
				cardA = Integer.parseInt(cards[0]);
				cardB = Integer.parseInt(cards[1]);

				if (cardA == cardB)
				{
					scoreA += cardA;
					scoreB += cardB;
					continue;
				}

				if (cardA > cardB)
					scoreA += cardA + cardB;
				else
					scoreB += cardA + cardB;
			}
			
			result.add(String.format("%d %d%n", scoreA, scoreB));
		}

		for(String item : result)
			System.out.print(item);

	}

}