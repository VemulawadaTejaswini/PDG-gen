import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String N = br.readLine();

	if (N.endsWith("2") || N.endsWith("4") || N.endsWith("5") || N.endsWith("7") || N.endsWith("9")) {
	    System.out.println("hon");
	} else if (N.endsWith("0") || N.endsWith("1") || N.endsWith("6") || N.endsWith("8")) {
	    System.out.println("pon");
	} else {
	    System.out.println("bon");
	}
    }
}
