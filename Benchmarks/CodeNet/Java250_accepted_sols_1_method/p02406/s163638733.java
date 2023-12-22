import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        	String list = br.readLine();
        	String an = null;
        	for (int i = 1; i <= Integer.parseInt(list); i++)
        	{
        		if (i % 3 == 0)
        			System.out.print(" " + i);
        		else
        		{
        			Integer oi = new Integer(i);
        			String suji = oi.toString();
        			char[] charsuji = suji.toCharArray();
        			for (int j = 0; j < suji.length(); j ++)
        			{
        				String newsuji = String.valueOf(charsuji[j]);
        				if (newsuji.equals("3"))
        				{
        					System.out.print(" " + i);
        				    break;
        				}
        			}
        		}
        	}
        	System.out.println();
	}

}