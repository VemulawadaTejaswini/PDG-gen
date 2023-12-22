import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String[] strArray = br.readLine().split(" ");
	int A = Integer.parseInt(strArray[0]);
	int B = Integer.parseInt(strArray[1]);
	int C = Integer.parseInt(strArray[2]);
	int K = Integer.parseInt(strArray[3]);
	int sum = 0;

	if (A > 0) {
	    if (K - A > 0) {
		sum += A;
		K -= A;
	    } else {
		sum = K;
		K = 0;
	    }
	}

	if (K > 0 && B > 0) {
	    if (K - B > 0) {
		K -= B;
	    } else {
		K = 0;
	    }
	}

	if (K > 0 && C > 0) {
	    sum = sum + (K * -1);
	}

	System.out.println(sum);
    }
}