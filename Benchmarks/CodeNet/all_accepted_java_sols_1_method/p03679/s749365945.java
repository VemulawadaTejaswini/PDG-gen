import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] strlist = str.split(" ");
		int x = Integer.parseInt(strlist[0]);
		int a = Integer.parseInt(strlist[1]);
		int b = Integer.parseInt(strlist[2]);

		String answer = "dangerous";
		if(a >= b){
			answer = "delicious";
		}else if(a >= b - x){
			answer = "safe";
		}
		System.out.println(answer);
	}
}
