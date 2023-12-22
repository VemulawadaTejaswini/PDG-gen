
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String line;
		String now = "A";
		while ((line = reader.readLine()) != null) {
			if (line.isEmpty())
				break;
			String[] lines = line.split(",");
			if(lines[0].equals(now)){
				now = lines[1];
			}else if(lines[1].equals(now)){
				now = lines[0];
			}
		}
		System.out.println(now);
	}
}