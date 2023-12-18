import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		if( line != null ){
			String[] parts = line.split(" ");
			int lon = Integer.parseInt(parts[0]);
			int sid = Integer.parseInt(parts[1]);
			System.out.println((lon * sid) + " " + (lon * 2 + sid * 2));
		}
	}

}