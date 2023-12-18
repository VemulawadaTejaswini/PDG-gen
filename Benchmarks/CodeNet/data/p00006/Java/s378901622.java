import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	Scanner in = new Scanner(System.in);
		
		String input = in.next();
		String output = new String("");
		
		for(int i = input.length() - 1; i >= 0; i--){
			output = output.concat(input.substring(i, i+1));
		}

		System.out.println(output);		
	}
}