import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
    
        int n = Integer.parseInt(br.readLine());
        String[] asaikoro = br.readLine().split(" ");
        int[][] as = new int[n][6];
        for (int i = 0; i < 6; i++)
        {
        	as[0][i] = Integer.parseInt(asaikoro[i]);
        }
        int count = 0;
        int[] bs = new int[6];
        
        for (int j = 0; j < n; j++)
        {
        	if (j != 0)
        	{
        		String[] bsaikoro = br.readLine().split(" ");
            	int a =  0;
            	for (int i = 0; i < 6; i++)
            	{
            		bs[i] = Integer.parseInt(bsaikoro[i]);
            	}
            	
            	for (int k = 0; k < j; k++)
            	{
            		if ((as[k][0] == bs[2] || as[k][0] == bs[3]) && (as[k][5] == bs[2] || as[k][5] == bs[3]))
                	{
                		a = bs[1];
            			bs[1] = bs[2];
            			bs[2] = bs[4];
            			bs[4] = bs[3];
            			bs[3] = a;
                	}
                	
                	for (int i = 0; i < 3; i++) //????????¢????????¢????????£???????????????
            		{
            			if (as[k][0] ==bs[0] && as[k][5] ==bs[5])
            				break;
            			a = bs[0];
            			bs[0] = bs[1];
            			bs[1] = bs[5];
            			bs[5] = bs[4];
            			bs[4] = a;
            		}
                	
                	for (int i = 0; i < 3; i++) //?¨??????¢????¨???¢????????£???????????????
            		{
            			if (as[k][1] ==bs[1] && as[k][4] ==bs[4])
            				break;
            			a = bs[1];
            			bs[1] = bs[2];
            			bs[2] = bs[4];
            			bs[4] = bs[3];
            			bs[3] = a;
            		}
                	if (as[k][0] == bs[0] && as[k][1] == bs[1] && as[k][2] == bs[2] && as[k][3] == bs[3] && as[k][4] == bs[4] && as[k][5] == bs[5])
                		count++;
            	}
            	for (int i = 0; i < 6; i++)
            	{
            		as[j][i] = bs[i];
            	}
        	}
        }
        if (count == 0)
        	System.out.println("Yes");
        else if (count >= 1)
        	System.out.println("No");
	}
}