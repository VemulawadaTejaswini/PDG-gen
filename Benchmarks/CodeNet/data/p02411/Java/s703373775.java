package pkg0316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException
	{
		int m,f,r,sum;
		char cRank=0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

		while(true)
		{
			String[] mfr = br.readLine().split(" ");
			m = Integer.parseInt(mfr[0]);
			f = Integer.parseInt(mfr[1]);
			r = Integer.parseInt(mfr[2]);

			sum = m+f;

			if(sum+r == -3){ cRank = 0;break; }

			else if(m*f < 0 || sum < 30) cRank = 'F';

			else if(30 <= sum && sum < 50)
			{
	/*			if(r <= 50)
				{
					cRank = 'C';
				}
				else
				{
					cRank = 'D';
				}*/

				cRank = (50 <= r)? 'C' : 'D';
			}

			else if(50 <= sum && sum < 65) cRank = 'C';

			else if(65 <= sum && sum < 80) cRank = 'B';

			else if(80 <= sum ) cRank = 'A';

			System.out.println(cRank);

		}
		//System.out.println(cRank);

	}

}