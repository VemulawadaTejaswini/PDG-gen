import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    String line = br.readLine();
	    int W = Integer.parseInt(line.split(" ")[0]);
	    int H = Integer.parseInt(line.split(" ")[1]);
	    int x = Integer.parseInt(line.split(" ")[2]);
	    int y = Integer.parseInt(line.split(" ")[3]);
	    int r = Integer.parseInt(line.split(" ")[4]);

	    if (r <= x && x <= (W - r) && r <= y && y <= (H - r)) {
		    System.out.println("Yes");
	    } else {
		    System.out.println("No");
	    }
	}
}