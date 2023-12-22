import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
    	String w = br.readLine();
    	int count = 0;
    	int owari = 0;
    	while (true)
    	{
    		String[] si = br.readLine().split(" ");
        	for (int i = 0; i < si.length; i++)
        	{
        		if (si[i].equals("END_OF_TEXT"))
        			{
        				owari++;
        				break;
        			}
        		String so = si[i];
        				if (w.equalsIgnoreCase(so))
                    		{
        						count++;
                    		}
        	}
        	if (owari == 1)
        		break;
    	}
    	System.out.println(count);
	}

}