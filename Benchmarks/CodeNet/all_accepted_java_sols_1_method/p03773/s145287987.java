
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] list = str.split(" ");
		int start = Integer.parseInt(list[0]);
		int end = Integer.parseInt(list[1]);
		int answer = start + end;
		if(start+end >=24){
			answer = answer - 24;
		}
		System.out.println(answer);

	}

}
