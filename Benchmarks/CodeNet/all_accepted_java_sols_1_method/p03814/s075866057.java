import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		int x = str.indexOf("A");
		int y = str.lastIndexOf("Z");

		System.out.println(y-x+1);

	}

}
