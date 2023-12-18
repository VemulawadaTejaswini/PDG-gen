import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        line=br.readLine();
    	line = line.replaceAll("apple", "藤田");
    	line = line.replaceAll("peach", "apple");
    	line = line.replaceAll("藤田", "peach");
    	System.out.println(line);
	}
}