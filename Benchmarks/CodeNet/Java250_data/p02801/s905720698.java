
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String info = br.readLine();

		char letter = info.charAt(0);
		char next = (char) (letter+1);
		if(letter==122) {
			System.out.println("a");
		}else {
			System.out.println(next);
		}
	}
}
