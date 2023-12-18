import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
    	String[] n = br.readLine().split(" ");
        int r = Integer.parseInt(n[0]);
        int c = Integer.parseInt(n[1]);
        int[][] rc = new int[r][c];
        int[] yoko = new int[r];
        int[] tate = new int[c];
        int sum = 0;
        for (int i = 0; i < r; i++)
        {
        	String[] rcinput = br.readLine().split(" ");
        	for (int j = 0; j < c; j++)
        	{
        		rc[i][j] = Integer.parseInt(rcinput[j]);
        		yoko[i] += Integer.parseInt(rcinput[j]);
        		tate[j] += Integer.parseInt(rcinput[j]);
        		sum += Integer.parseInt(rcinput[j]);
        	}
        }
        
        for (int i = 0; i < r + 1; i++)
        {
        	for (int j = 0; j < c + 1; j++)
        	{
        		if (i < r && j <c)
        			System.out.print(rc[i][j] + " ");
        		else if (j == c && i != r)
        			System.out.println(yoko[i]);
        		else if (i == r && j != c)
        			System.out.print(tate[j] + " ");
        		else if (i == r && j == c)
        			System.out.println(sum);
        	}
        }
	}

}