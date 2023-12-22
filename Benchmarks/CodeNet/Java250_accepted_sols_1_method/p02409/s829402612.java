import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException
	{
		int[][] room = new int[12][10];
		int i,j,n,x,y;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		n = Integer.parseInt(br.readLine() );//input n

		int[] b = new int[n];
		int[] f = new int[n];
		int[] r = new int[n];
		int[] v = new int[n];

		for(i=0; i<n; i++)
		{
			String[] str = br.readLine().split(" ");

			b[i] = Integer.parseInt(str[0]);
			f[i] = Integer.parseInt(str[1]);
			r[i] = Integer.parseInt(str[2]);
			v[i] = Integer.parseInt(str[3]);

			x = f[i] + 3*(b[i]-1);
			y = r[i];

			room[x-1][y-1] += v[i];
		}

		for(i=0; i<12; i++)
		{
			for(j=0; j<10; j++)
			{
				System.out.print(" " + room[i][j]);
			}

			System.out.println();
			if( (i+1)%3==0 && i<11) System.out.println("####################");
		}

	}
}