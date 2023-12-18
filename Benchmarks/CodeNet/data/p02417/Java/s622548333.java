import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] count = new int[26];
        while (true)
        {
        	String input = br.readLine();
        	if (input.isEmpty())
        	{
        		break;
        	}
        	for (int i = 0; i < input.length(); i++)
            {
            	for (int j = 0; j < 26; j++)
            	{
            		if (alphabet[j].equalsIgnoreCase(String.valueOf(input.charAt(i))))
            			count[j]++;
            	}
            }
        }
        for (int i = 0; i < 26; i++)
        {
        	if (count[i] > 0)
        		System.out.println(alphabet[i] + " : " + count[i]);
        	else
        		System.out.println(alphabet[i] + " : " + 0);
        }
	}

}