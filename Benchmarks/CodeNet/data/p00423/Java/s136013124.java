import java.io.BufferedReader;
import java.io.InputStreamReader;

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

		for (;;)
		{
			set = Integer.parseInt(br.readLine());
			if (set == 0)
				break;

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
		}

		System.out.printf("%d %d%n", scoreA, scoreB);

	}

}