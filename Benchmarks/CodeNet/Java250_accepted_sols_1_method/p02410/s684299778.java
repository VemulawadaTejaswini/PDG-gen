import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[][] an = new int[n][m];
        int[] bn = new int[m];
		for (int i = 0; i < n; i++)
		{
			String[] aninput = br.readLine().split(" ");
			for (int j = 0; j < m; j++)
			{
				an[i][j] = Integer.parseInt(aninput[j]);
			}
		}
		for (int i = 0; i < m; i++)
		{
			String bninput = br.readLine();
			bn[i] = Integer.parseInt(bninput);
		}
		
		
		for (int i = 0; i < n; i++)
		{
			int sum = 0;
			for (int j = 0; j < m; j++)
			{
				sum += an[i][j] * bn[j];
			}
			System.out.println(sum);
		}
		
	}

}