import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String S = br.readLine();
	char array[] = S.toCharArray();
	if (array[0] != array[1] && array[1] != array[2] && array[2] != array[3])
	    System.out.println("Good");
	else
	    System.out.println("Bad");
    }
}
