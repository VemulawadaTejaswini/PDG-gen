import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	char charArray[] = br.readLine().toCharArray();
	if (charArray[0] == 'R' && charArray[1] == 'R' && charArray[2] == 'R') {
	    System.out.println(3);
	} else if (charArray[0] == 'R' && charArray[1] == 'R' || charArray[1] == 'R' && charArray[2] == 'R') {
	    System.out.println(2);
	} else if (charArray[0] == 'R' || charArray[1] == 'R' || charArray[2] == 'R') {
	    System.out.println(1);
	} else {
	    System.out.println(0);
	}
    }
}