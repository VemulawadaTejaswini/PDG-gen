import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			int r = stdIn.nextInt();
			Queue<Integer> deckA = new ArrayDeque<Integer>();
			Queue<Integer> deckB = new ArrayDeque<Integer>();
			Queue<Integer> deckC = new ArrayDeque<Integer>();
			for(int i = 0; i < n; ++i)
			{
				deckC.add(i);
			}
			while(r-- != 0)
			{
				int c = stdIn.nextInt();
				if(n % 2 == 1)
				{
					for(int i = 0; i < n / 2; ++i)
					{
						deckB.add(deckC.poll());
					}
					for(int i = 0; i < n / 2 + 1; ++i)
					{
						deckA.add(deckC.poll());
					}
				}
				else
				{
					for(int i = 0; i < n / 2; ++i)
					{
						deckB.add(deckC.poll());
					}
					for(int i = 0; i < n / 2; ++i)
					{
						deckA.add(deckC.poll());
					}
				}
				while(!deckA.isEmpty())
				{
					for(int i = 0; i < c; ++i)
					{
						if(deckA.isEmpty())
						{
							break;
						}
						deckC.add(deckA.poll());
					}
					for(int i = 0; i < c; ++i)
					{
						if(deckB.isEmpty())
						{
							break;
						}
						deckC.add(deckB.poll());
					}
				}
			}
			for(int i = 0; i < n - 1; ++i)
			{
				deckC.poll();
			}
			System.out.println(deckC.peek());
		}
	}
}