
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] list = str.split(" ");
		long n = Long.parseLong(list[0]);
		long m = Long.parseLong(list[1]);
		long answer = 0;

		if(n > m/2){
			answer = m/2;
		}else{
			answer = n + (m-n*2)/4;
		}
		System.out.println(answer);
	}

}
