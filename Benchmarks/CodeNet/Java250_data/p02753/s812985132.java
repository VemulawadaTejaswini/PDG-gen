
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String S[] = br.readLine().split("");
	if (S[0].equals(S[1]) && (S[1].equals(S[2]))) {
	    System.out.println("No");
	} else {
	    System.out.println("Yes");
	}
    }
}