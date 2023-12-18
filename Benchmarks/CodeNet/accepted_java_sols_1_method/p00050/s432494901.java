import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		try {
			while ((line = br.readLine()) != null) {
				line = line.trim();
				
				line = line.replaceAll("apple", "ELPPAHCAEP");
				line = line.replaceAll("peach", "apple");
				line = line.replaceAll("ELPPAHCAEP", "peach");
				
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}