import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] strlist = str.split(" ");

		int answer = 3;

		if(strlist[0].equals(strlist[1])){
			answer = answer - 1;
		}

		if(strlist[1].equals(strlist[2])){
			answer = answer - 1;
		}

		if(strlist[2].equals(strlist[0])){
			answer = answer - 1;
		}

		if(answer == 0){
			answer = 1;
		}

		System.out.println(answer);

	}

}
