import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        while (true)
        {
        	String[] test = br.readLine().split(" ");
            int m = Integer.parseInt(test[0]);
            int f = Integer.parseInt(test[1]);
            int r = Integer.parseInt(test[2]);
            if(m == -1 && f == -1 && r == -1)
            	break;
            
            if ((m == -1) || (f == - 1))
            	System.out.println("F");
            else
            {
            	if((m + f) >= 80)
                	System.out.println("A");
            	else if((m + f) >= 65)
                	System.out.println("B");
            	else if((m + f) >= 50)
                	System.out.println("C");
            	else if((m + f) >= 30)
            	{
            		if (r >= 50)
            			System.out.println("C");
            		else
            			System.out.println("D");
            	}
            	else if ((m + f) < 30)
                	System.out.println("F");
            }
            
        }
        
		
	}

}