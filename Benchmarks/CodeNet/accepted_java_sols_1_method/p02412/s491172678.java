import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        while (true)
        {
        	String[] nx = br.readLine().split(" ");
            int n = Integer.parseInt(nx[0]);
            int x = Integer.parseInt(nx[1]);
            if(n == 0 && x == 0)
            	break;
            
            int count = 0;
            for (int i = 1; i <= n - 2; i++)
            {
            	for (int j = i + 1; j <= n -1; j++)
            	{
            		for (int k = j + 1; k <= n; k++)
            		{
            			if ((i + j + k) == x)
            				count++;
            		}
            	}
            }
            System.out.println(count);
        }
        
		
	}

}