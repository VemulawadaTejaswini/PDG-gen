import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		if( line != null ){
			int i = Integer.parseInt(line);
			System.out.println((int)Math.pow(i, 3));
		}
	}
}