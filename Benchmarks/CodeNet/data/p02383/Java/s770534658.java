import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
    
    	String[] sai = br.readLine().split(" ");
    	String order = br.readLine();
    	int[] newsai = new int[6];
    	int a =  0;
    	for (int i = 0; i < 6; i++)
    	{
    		newsai[i] = Integer.parseInt(sai[i]);
    	}
    	
    	for (int i = 0; i < order.length(); i++)
    	{
    		char houkou = order.charAt(i);
    		if (houkou == 'N')
    		{
    			a = newsai[0];
    			newsai[0] = newsai[1];
    			newsai[1] = newsai[5];
    			newsai[5] = newsai[4];
    			newsai[4] = a;
    		}
    		else if (houkou == 'S')
    		{
    			a = newsai[0];
    			newsai[0] = newsai[4];
    			newsai[4] = newsai[5];
    			newsai[5] = newsai[1];
    			newsai[1] = a;
    		}
    		else if (houkou == 'E')
    		{
    			a = newsai[0];
    			newsai[0] = newsai[3];
    			newsai[3] = newsai[5];
    			newsai[5] = newsai[2];
    			newsai[2] = a;
    		}
    		else if (houkou == 'W')
    		{
    			a = newsai[0];
    			newsai[0] = newsai[2];
    			newsai[2] = newsai[5];
    			newsai[5] = newsai[3];
    			newsai[3] = a;
    		}
    	}
    	System.out.println(newsai[0]);
	}
}