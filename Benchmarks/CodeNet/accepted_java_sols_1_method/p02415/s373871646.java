

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// input
		String tempStr= br.readLine();//clear

		// Constraints

		for(int i= 0; i < tempStr.length(); i++){
			if(Character.isLowerCase(tempStr.charAt(i)))
				// output
				System.out.print(Character.toUpperCase(tempStr.charAt(i)));
		else
			System.out.print(Character.toLowerCase(tempStr.charAt(i)));
		}
		System.out.println();
	}
}