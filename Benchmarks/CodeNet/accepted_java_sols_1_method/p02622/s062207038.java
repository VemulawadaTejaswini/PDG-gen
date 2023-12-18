import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	char s[] = br.readLine().toCharArray();
	char t[] = br.readLine().toCharArray();

	int err = 0;

	for (int i = 0; i < s.length; i++) {
	    if (s[i] != t[i]) {
		err++;
	    }
	}

	System.out.println(err);
    }

}