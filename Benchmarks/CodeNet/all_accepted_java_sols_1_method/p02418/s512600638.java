import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
    	String sinput = br.readLine();
    	String p = br.readLine();
    	String s = sinput + sinput;
    	int count = 0;
    	int index = 0;
    	
    	for (int i = 0; i < s.length(); i++)
    	{
    		if (p.charAt(0) == s.charAt(i))
    		{
    			if (i + p.length() < s.length())
    			{
    				if (p.equals(s.substring(i, i + p.length() )))
                		count++;
    			}
    			
    		}
    	}
    	if (count >= 1)
    		System.out.println("Yes");
    	else
    		System.out.println("No");
	}

}