import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] strlist = str.split(" ");
		int a = Integer.parseInt(strlist[0]);
		int b = Integer.parseInt(strlist[1]);
		int c = Integer.parseInt(strlist[2]);
 
		String answer = "NO";
 
		for(int i=0; i<b; i++){
			if((i*b+c) % a == 0){
				answer = "YES";
				break;
			}
		}
		System.out.println(answer);
	}
 
 
}