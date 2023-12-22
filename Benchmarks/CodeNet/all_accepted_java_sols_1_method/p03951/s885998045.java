import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		int n = Integer.parseInt(str);
		String s = input.readLine( );
		String t = input.readLine( );
		int answer = n * 2;

		for(int i=0; i<n; i++){
			if(s.substring(i).equals(t.substring(0, n-i))){
				answer = answer - (n-i);
				break;
			}
		}

		System.out.println(answer);

	}
}
