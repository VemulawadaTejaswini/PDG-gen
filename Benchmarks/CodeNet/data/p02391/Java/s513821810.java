import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    String line = br.readLine();
	    int a = Integer.parseInt(line.split(" ")[0]);
	    int b = Integer.parseInt(line.split(" ")[1]);

	    if (a < b) {
		    System.out.println("a < b");
	    } else if (a > b) {
		    System.out.println("a > b");
	    } else {
		    System.out.println("a == b");
	    }
	}
}