import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException
	{
		int m,f,r,sum,i;
		char cRank[] = new char[256];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

		for(i=0; i<255; i++)
		{
			String[] mfr = br.readLine().split(" ");
			m = Integer.parseInt(mfr[0]);
			f = Integer.parseInt(mfr[1]);
			r = Integer.parseInt(mfr[2]);

			sum = m+f;

			if(sum+r == -3)  break;

			else if(m*f < 0 || sum < 30) cRank[i] = 'F';

			else if(30 <= sum && sum < 50) cRank[i] = (50 <= r)? 'C' : 'D';

			else if(50 <= sum && sum < 65) cRank[i] = 'C';

			else if(65 <= sum && sum < 80) cRank[i] = 'B';

			else if(80 <= sum ) cRank[i] = 'A';

		}

		br.close();

		for(int n=0; n<i; n++) System.out.println(cRank[n]);
	}
}