import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
    	String input = br.readLine();
    	String ans = "";
    	for (int i = 0; i < input.length(); i++)
    	{
    		if (Character.isLowerCase(input.charAt(i)))
    			ans += String.valueOf(Character.toUpperCase(input.charAt(i)));
    		else
    			ans += String.valueOf(Character.toLowerCase(input.charAt(i)));
    	}
    	System.out.println(ans);
	}

}