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
        			card[0][suji] += 1;
        		else if (color[j].equals("G"))
        			card[1][suji] += 1;
        		else if (color[j].equals("B"))
        			card[2][suji] += 1;
        	}
        	
        	
        	
        	int set = 0;
        	for (int j = 0; j < 3; j++)
        	{
        		for (int k = 0; k < 9; k++)
        		{
        			if (k < 7)
        			{
        				if (card[j][k] > 0 && card[j][k + 1] > 0 && card[j][k + 2] > 0)
                		{
                			set++;
                			card[j][k]--;
                			card[j][k + 1]--;
                			card[j][k + 2]--;
                			k--;
                			//System.out.println("a");
                			continue;
                		}
        			}
        			//System.out.println(card[j][k]);
        			if (card[j][k] >= 1)
        			{
        				set++;
            			card[j][k] -= 3;
            			k--;
            			//System.out.println("b");
        			}
        		}
        		
        	}if (set >= 3)
        		System.out.println(1);
        	else
        		System.out.println(0);
        }
	}
}