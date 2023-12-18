import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String array[] = br.readLine().split(" ");
	int x = Integer.parseInt(array[0]);
	int y = Integer.parseInt(array[1]);
	String res;
	if (4 * x > y || 2 * x < y) {
	    res = "No";
	} else if (y % 2 == 0 || y % 4 == 0 || y % 4 == 2) {
	    res = "Yes";
	} else {
	    res = "No";
	}
	System.out.println(res);
    }
}
