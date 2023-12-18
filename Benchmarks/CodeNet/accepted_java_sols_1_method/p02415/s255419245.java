

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =
				new BufferedReader (new InputStreamReader (System.in));
			String str = input.readLine( );

			 for (char c: str.toCharArray()){
			        if(Character.isLowerCase(c)){
			            System.out.print(Character.toUpperCase(c));
			        }else{
			            System.out.print(Character.toLowerCase(c));
			        }
			    }
			     System.out.println();
	}
}