import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{

	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = new String[3];
		str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		int l = Integer.parseInt(str[2]);
		int[][] A = new int[n][m];
		int[][] B = new int[m][l];
		int[][] C = new int[n][l];
//		C????????????
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<l;j++)
//			{
//				C[i][j] = 0;
//			}
//		}
//		A????????????????´?
		String[] str_m = new String[m];
		for(int i=0; i<n; i++)
		{
			str_m = br.readLine().split(" ");
			for(int j=0; j<m; j++)
			{
				A[i][j] = Integer.parseInt(str_m[j]);
			}
		}
//		?¬????B
		String[] str_l = new String[l];
		for(int i=0; i<m; i++)
		{
			str_l = br.readLine().split(" ");
			for(int j=0; j<l; j++)
			{
				B[i][j] = Integer.parseInt(str_l[j]);
			}
		}
//		C???A*B???????´?????????????
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<l; j++)
			{
				for(int k=0; k<m; k++)
				{
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<l; j++)
			{
				System.out.print(C[i][j]);
				if(j!=l-1)	System.out.print(" ");
				else 	System.out.println();
			}
		}
	}
}