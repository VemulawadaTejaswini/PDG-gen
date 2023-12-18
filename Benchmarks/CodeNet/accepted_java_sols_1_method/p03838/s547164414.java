
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		String[] xy = str.split(" ");
		int x = Integer.parseInt(xy[0]);
		int y = Integer.parseInt(xy[1]);
		int answer = 0;

		if(x<y){
			if(0<=x){
				answer = y - x;
			}else if(0<y){
				answer = Math.abs(Math.abs(y) - Math.abs(x)) + 1;
			}else{
				answer = y - x;
			}
		}else{
			if(0<y){
				answer = x - y + 2;
			}else if(0<=x){
				answer = Math.abs(Math.abs(x) - Math.abs(y)) + 1;
			}else{
				answer = x - y + 2;
			}
		}

		System.out.println(answer);

	}
}
