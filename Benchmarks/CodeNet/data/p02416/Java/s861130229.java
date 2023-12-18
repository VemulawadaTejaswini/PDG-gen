import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        while (true)
        {
        	String input = br.readLine();
        	long suji = Long.parseLong(input);
        	if (suji == 0)
        		break;
        	long sum = 0;
        	for (int i = 0; i < input.length(); i++)
        	{
        		String a = String.valueOf(input.charAt(i));
        		sum += Long.parseLong(a);
        	}
        	System.out.println(sum);
        	
        }
    	
	}

}