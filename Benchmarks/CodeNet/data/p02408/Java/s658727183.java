import java.util.Scanner;

import javax.sound.midi.Track;

public class Main
{

	public static void main(String[] args)
	{
		boolean[][] card = new boolean[5][14];
		for (int i = 0; i < card.length; i++)
		{
			for (int j = 0; j < card[i].length; j++)
			{
				card[i][j] = false;
			}
		}
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String c;
		int m;

		for (int i = 1; i <= n; i++)
		{
			c = in.next();
			m = in.nextInt();
			switch (c.charAt(0))
			{
			case 'S':
				card[1][m] = true;
				break;
			case 'H':
				card[2][m] = true;
				break;
			case 'C':
				card[3][m] = true;
				break;
			case 'D':
				card[4][m] = true;
				break;
			default:
				System.out.println("?????????");
				break;
			}

		}
		
		//System.out.println("????§? \n");

		for (int i = 1; i < card.length; i++)
		{
			for (int j = 1; j < card[i].length; j++)
			{
				if (card[i][j] == false)
				{
					switch (i)
					{
					case 1:
						System.out.println("S " + (j));
						break;
					case 2:
						System.out.println("H " + (j));
						break;
					case 3:
						System.out.println("C " + (j));
						break;
					case 4:
						System.out.println("D " + (j));
						break;

					default:
						break;
					}
					
				}
			}
		}

	}
}