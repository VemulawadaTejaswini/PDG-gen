
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		int n = Integer.parseInt(str);
		int answer = 0;
		answer = n*800 - (n/15)*200;
		System.out.println(answer);
	}

}
