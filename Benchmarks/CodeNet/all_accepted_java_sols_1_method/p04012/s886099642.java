
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );

		String before = str;
		String after = "";
		int diff = 0;

		while(before.length() > 0){
			after = before.replace(String.valueOf(before.charAt(0)), "");
			diff = before.length() - after.length();
			if(diff%2 != 0){
				System.out.println("No");
				System.exit(0);
			}
			before = after;
		}

		System.out.println("Yes");

	}

}
