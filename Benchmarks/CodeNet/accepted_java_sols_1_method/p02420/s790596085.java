import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    StringBuilder result = new StringBuilder();
	    while (true) {
		    String line = br.readLine();

		    if ("-".equals(line)) break;

		    int shuffleCount = Integer.parseInt(br.readLine());

		    for (int i = 0; i < shuffleCount; i++) {
		    	int h = Integer.parseInt(br.readLine());
		    	// shuffle
		    	line = line.substring(h, line.length()) + line.substring(0, h);

		    }
		    result.append(line).append("\n");
	    }
	    System.out.print(result.toString());
	}
}