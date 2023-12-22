import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String array[] = br.readLine().split(" ");

	for (int i = 0; i < array.length; i++) {
	    if (Integer.parseInt(array[i]) == 0) {
		System.out.println(i + 1);
		break;
	    }
	}
    }
}
