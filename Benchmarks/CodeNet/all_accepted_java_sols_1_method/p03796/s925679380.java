
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		int n = Integer.parseInt(str);
		Long answer = (long) 1;
		int pow = (int)(Math.pow(10, 9) + 7);

		for(int i=1; i<=n; i++){
			answer = answer * i;
			answer = answer % pow;
		}
		System.out.println(answer);

	}

}
