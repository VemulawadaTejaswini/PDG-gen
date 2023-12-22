import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main (String[] args) throws IOException{
	    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
		String[] str = in.readLine().split(" ");
		int X = Integer.parseInt(str[0]);
		int Y = Integer.parseInt(str[1]);
		if((Y-2*X)%2 == 0 && (Y-2*X)/2 >= 0 && X-((Y-2*X)/2) >= 0) {
			System.out.println("Yes");
		}else
			System.out.println("No");
	}
}