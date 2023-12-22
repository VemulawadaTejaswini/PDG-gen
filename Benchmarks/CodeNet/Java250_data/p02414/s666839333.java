import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
    	String[] nml= br.readLine().split(" ");
        int n = Integer.parseInt(nml[0]);
        int m = Integer.parseInt(nml[1]);
        int l = Integer.parseInt(nml[2]);
        int[][] nm = new int[n][m];
        int[][] ml = new int[m][l];
        
        for (int i = 0; i < n; i++)
        {
        	String[] nminput= br.readLine().split(" ");
        	for (int j = 0; j < m; j++)
        	{
        		nm[i][j] = Integer.parseInt(nminput[j]);
        	}
        }
        for (int i = 0; i < m; i++)
        {
        	String[] mlinput= br.readLine().split(" ");
        	for (int j = 0; j < l; j++)
        	{
        		ml[i][j] = Integer.parseInt(mlinput[j]);
        	}
        }
        
        
        for (int i = 0; i < n; i++)
        {
        	for (int j = 0; j < l; j++)
        	{
        		long sum = 0;
        		for (int k = 0; k < m; k++)
        		{
        			sum += nm[i][k] * ml[k][j];
        		}
        		System.out.print(sum);
        		if (j != l- 1)
        			System.out.print(" ");
        	}
        	System.out.println();
        }
	}

}