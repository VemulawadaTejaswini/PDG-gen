import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int i;
	String N = br.readLine();
	int Num = Integer.parseInt(N);
	long sum = 0;

	for (i = 1; i <= Num; i++ ) {
		if (i % 3 != 0 && i % 5 != 0) sum = sum + i;
	}

	System.out.println(sum);
	}
}