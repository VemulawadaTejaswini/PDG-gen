import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int b, f, r, v;
    	int[][][] kousya = new int[4][3][10];
    	for (int i = 0; i < 4; i++)
    	{
    		for (int j = 0; j < 3; j++)
    		{
    			for (int k = 0; k < 10; k++)
    			{
    				kousya[i][j][k] = 0;
    			}
    		}
    	}
        	String kensu = br.readLine();
        	for (int i = 0; i < Integer.parseInt(kensu); i++)
        	{
            	String[] nyukyo = br.readLine().split(" ");
            		b = Integer.parseInt(nyukyo[0]) - 1;
            		f = Integer.parseInt(nyukyo[1]) - 1;
            		r = Integer.parseInt(nyukyo[2]) - 1;
            		v = Integer.parseInt(nyukyo[3]);
            		
            		kousya[b][f][r] += v;
        	}
        	for (int i = 0; i < 4; i++)
        	{
        		for (int j = 0; j < 3; j++)
        		{
        			for (int k = 0; k < 10; k++)
        			{
        				System.out.print(" ");
        				System.out.print(kousya[i][j][k]);
        			}
        			System.out.println();
        		}
        		if (i != 3)
        			System.out.println("####################");
        	}
        	
	}

}