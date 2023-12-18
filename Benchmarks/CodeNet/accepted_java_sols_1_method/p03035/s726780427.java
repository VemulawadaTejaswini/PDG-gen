import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader masae = new BufferedReader(new InputStreamReader(System.in));
	String masae2[] = masae.readLine().split(" ");
	int A = Integer.parseInt(masae2[0]);
	int B = Integer.parseInt(masae2[1]);
	if (A >= 13) {
	    System.out.println(B);
	} else if (A >= 6 && A <= 12) {
	    System.out.println(B / 2);
	} else if (A <= 5) {
	    System.out.println(0);
	}
    }
}