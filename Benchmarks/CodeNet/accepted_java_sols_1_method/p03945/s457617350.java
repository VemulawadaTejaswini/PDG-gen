import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );

		while(str.contains("BB") || str.contains("WW")){
			if(str.contains("BB")){
				str = str.replace("BB", "B");
			}else{
				str = str.replace("WW", "W");
			}
		}
		System.out.println(str.length()-1);

	}
}
