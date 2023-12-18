import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        while (true)
        {
        	String input = br.readLine();
        	if (input.equals("0"))
        		break;
        	int sum = 0;
        	for (int i = 0; i < input.length(); i++)
        	{
        		String a = String.valueOf(input.charAt(i));
        		sum += Integer.parseInt(a);
        	}
        	System.out.println(sum);
        	
        }
    	
	}

}