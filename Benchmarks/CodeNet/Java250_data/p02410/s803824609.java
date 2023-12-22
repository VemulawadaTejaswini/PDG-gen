import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException
	{
		int i,j,n,m;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

		String[] nm = br.readLine().split(" ");

		n = Integer.parseInt(nm[0]);//input n
		m = Integer.parseInt(nm[1]);//input m

		int[][] matrix = new int[n][m];
		int[] vector = new int[m];
		int[] out = new int[n];

		for(i=0; i<n; i++)//get matrix
		{
			String[] str = br.readLine().split(" ");

			for(j=0; j<m; j++)
			{
				matrix[i][j] = Integer.parseInt(str[j]);
			}
		}

		for(i=0; i<m; i++)//get Vmatrix
		{
			String str = br.readLine();
			vector[i] = Integer.parseInt(str);
		}

		for(i=0; i<n; i++)//calc
		{
			for(j=0; j<m; j++)
			{
				out[i] = out[i] + matrix[i][j]*vector[j];
			}

			System.out.println(out[i]);
		}

/*++++++++++++++++++++++++++++++++++++*/
/*		for(i=0; i<n; i++)
		{
			for(j=0; j<m; j++)
			{
				System.out.print(matrix[i][j]);
			}

			System.out.println();
		}

		for(i=0; i<m; i++)
		{
			System.out.println(vector[i]);
		}*/

	}
}