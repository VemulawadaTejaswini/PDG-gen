import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
    
    	String[] sai = br.readLine().split(" ");
    	Integer q = Integer.parseInt(br.readLine());
    	int[] newsai = new int[6];
    	int a =  0;
    	
    	for (int i = 0; i < 6; i++)
    	{
    		newsai[i] = Integer.parseInt(sai[i]);
    	}
    	
    	for (int i = 0; i < q; i++)
    	{
    		String[] order = br.readLine().split(" ");
    		int ue = Integer.parseInt(order[0]);
    		int mae = Integer.parseInt(order[1]);
    		
    		if (ue == newsai[2] || ue == newsai[3]) //????????¢??????????¨??????????????¢????
    		{
    			a = newsai[1];
    			newsai[1] = newsai[2];
    			newsai[2] = newsai[4];
    			newsai[4] = newsai[3];
    			newsai[3] = a;
    		}
    		
    		while (true) //????????¢????????¢????????£???????????????
    		{
    			if (ue ==newsai[0])
    				break;
    			a = newsai[0];
    			newsai[0] = newsai[1];
    			newsai[1] = newsai[5];
    			newsai[5] = newsai[4];
    			newsai[4] = a;
    		}
    		while (true)
    		{
    			if (mae ==newsai[1])
    				break;
    			a = newsai[1];
    			newsai[1] = newsai[2];
    			newsai[2] = newsai[4];
    			newsai[4] = newsai[3];
    			newsai[3] = a;
    		}
    		System.out.println(newsai[2]);
    	}
    	
	}
}