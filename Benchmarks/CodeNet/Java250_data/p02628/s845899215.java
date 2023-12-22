import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String numberArray[] = br.readLine().split(" ");
	int N = Integer.parseInt(numberArray[0]);
	int K = Integer.parseInt(numberArray[1]);

	String inputArray[] = br.readLine().split(" ");
	int priceArray[] = new int[N];
	for (int i = 0; i < N; i++) {
	    priceArray[i] = Integer.parseInt(inputArray[i]);
	}

	Arrays.sort(priceArray);
	int result = 0;
	for (int j = 0; j < K; j++) {
	    result += priceArray[j];
	}
	System.out.println(result);
    }
}
