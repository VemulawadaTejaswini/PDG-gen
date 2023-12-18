import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[2];
		int r, c;
		str = br.readLine().split(" ");
		r = Integer.parseInt(str[0]);
		c = Integer.parseInt(str[1]);
		int[][] mat = new int[r+1][c+1];
//		mat????????????
		for(int i=0;i<r+1;i++)
		{
			for(int j=0;j<c+1;j++)
			{
				mat[i][j] = 0;
			}
		}
		String[] str2 = new String[c];
		for(int i=0; i<r; i++)
		{
			str2 = br.readLine().split(" ");
			int buf = 0;
			for(int j=0; j<c; j++)
			{
				buf = Integer.parseInt(str2[j]);
				mat[i][j] = buf;
				mat[i][c] += buf;
				mat[r][j] += buf;
			}
			mat[r][c] += mat[i][c];
		}
		for(int i=0; i<r+1; i++)
		{
			for(int j=0; j<c+1; j++)
			{
				System.out.print(mat[i][j]);
				if(j!=c) System.out.print(" ");
				else System.out.println();
			}
		}
	}
}