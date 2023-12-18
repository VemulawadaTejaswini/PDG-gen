import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException
	{
		int m,f,r,sum;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

		for(int i=0; i<255; i++)
		{
			String[] mfr = br.readLine().split(" ");
			m = Integer.parseInt(mfr[0]);
			f = Integer.parseInt(mfr[1]);
			r = Integer.parseInt(mfr[2]);

			sum = m+f;

			if(sum+r == -3)  break;

			else if(m*f < 0 || sum < 30) System.out.println("F");

			else if(30 <= sum && sum < 50) System.out.println( (50 <= r) ? 'C' : 'D');

			else if(50 <= sum && sum < 65) System.out.println("C");

			else if(65 <= sum && sum < 80) System.out.println("B");

			else if(80 <= sum ) System.out.println("A");

		}
	}
}