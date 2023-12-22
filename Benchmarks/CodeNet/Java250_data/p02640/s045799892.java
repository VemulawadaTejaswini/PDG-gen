import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String array[] = br.readLine().split(" ");
	int x = Integer.parseInt(array[0]);
	int y = Integer.parseInt(array[1]);
	int z = y % 4;
	if ((z == 0 || z % 2 == 0) && 4 * x >= y && 2 * x <= y) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}

    }
}
