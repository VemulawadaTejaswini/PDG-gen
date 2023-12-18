import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main (String[] args) throws IOException{
	    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
		String[] str = in.readLine().split(" ");
		int size = str.length;

		for(int i=0; i < size; i++) {
			int num = Integer.parseInt(str[i]);
			if(num == 0) {
				System.out.println(i+1);
			}
		}
	}
}