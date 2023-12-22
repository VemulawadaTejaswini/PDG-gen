import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    while (true) {
		    String line = br.readLine();
		    int x = Integer.parseInt(line.split(" ")[0]);
		    int y = Integer.parseInt(line.split(" ")[1]);

		    if (x == 0 && y == 0) break;

		    System.out.println(x < y ? x + " " + y : y + " " + x);
	    }
	}
}