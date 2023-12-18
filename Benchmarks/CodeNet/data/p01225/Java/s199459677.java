import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
    
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++)
        {
        	String[] sinput = br.readLine().split(" ");
        	String[] color = br.readLine().split(" ");
        	int[][] card = new int[3][9];
        	
        	for (int j = 0; j < 9; j++)
        	{
        		int suji = Integer.parseInt(sinput[j]) - 1;
        		
        		if (color[j].equals("R"))
        			card[0][suji]++;
        		else if (color[j].equals("G"))
        			card[1][suji]++;
        		else if (color[j].equals("B"))
        			card[2][suji]++;
        	}
        	
        	
        	
        	int win = 0;
        	for (int j = 0; j < 3; j++)
        	{
        		for (int k = 0; k < 9; k++)
        		{
        			if (card[j][k] > 0 && card[j][k + 1] > 0 && card[j][k + 2] > 0)
            		{
            			win++;
            			card[j][k]--;
            			card[j][k + 1]--;
            			card[j][k + 2]--;
            			k--;
            			continue;
            		}
        			else if (card[j][k] >= 3)
        			{
        				win++;
            			card[j][k] -= 3;
            			k--;
        			}
        		}
        		
        	}
        	if (win >= 3)
        		System.out.println(1);
        	else
        		System.out.println(0);
        }
	}
}