import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int K = Integer.parseInt(br.readLine());
	String[] array = br.readLine().split(" ");

	int A = Integer.parseInt(array[0]), B = Integer.parseInt(array[1]);

	String result = "NG";
	for (int i = A; i <= B; i++) {
	    if (i % K == 0) {
		result = "OK";
		break;
	    }
	}
	System.out.println(result);
    }
}