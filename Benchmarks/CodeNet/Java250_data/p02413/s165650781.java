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
		int[] vsum = new int[m];
		int sum=0;

		for(i=0; i<n; i++)//get matrix
		{
			String[] str = br.readLine().split(" ");

			for(j=0; j<m; j++)
			{
				matrix[i][j] = Integer.parseInt(str[j]);
			}
		}

		for(i=0; i<m; i++)//print reverse
		{
			for(j=0; j<n; j++)
			{
//				System.out.print(matrix[j][i] + " ");
				vsum[i] += matrix[j][i];
			}

//			System.out.println(vsum[i]);
		}

		for(i=0; i<n; i++)//printf
		{
			for(j=0; j<m; j++)
			{
				System.out.print(matrix[i][j] + " ");
				sum += matrix[i][j];
			}

			System.out.println(sum);
			sum = 0;
		}

		for(i=0; i<m; i++)
		{
			System.out.print(vsum[i] + " ");
			sum += vsum[i];
		}

		System.out.println(sum);
	}

}