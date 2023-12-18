import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Long N = Long.parseLong(br.readLine());
	int count = 0;
	for (int i = 2; i <= N; i++) {
	    if (N % i == 0) {
		N /= i;
		count++;
	    }
	}
	System.out.println(count);

    }
}