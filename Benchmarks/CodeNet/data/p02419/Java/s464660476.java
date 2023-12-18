import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
    	String w = br.readLine();
    	int count = 0;
    	
    	while (true)
    	{
    		String si = br.readLine();
    		if (si.equals("END_OF_TEXT"))
    			break;
        	
        	for (int i = 0; i < si.length(); i++)
        	{
        		String wn = String.valueOf(w.charAt(0));
        		String sn = String.valueOf(si.charAt(i));
        		if (sn.equalsIgnoreCase(wn))
        			if (i + w.length() <= si.length())
        			{
        				//System.out.println(si.substring(i, i + w.length() ));
        				if (w.equalsIgnoreCase(si.substring(i, i + w.length() )))
                    		{
        						count++;
        						i += w.length();
                    		}
        			}
        	}
    	}
    	
    	System.out.println(count);
	}

}