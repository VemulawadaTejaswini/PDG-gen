
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	int N = Integer.parseInt(scan.next());
	long A = Long.parseLong(scan.next());
	long B = Long.parseLong(scan.next());

	long[] X = new long[N];
	for (int i = 0; i < N; i++) {
	    X[i] = Long.parseLong(scan.next());
	}

	int rest = N-1;
	long cost = 0;
	for (int i = 1; i < N; i++) {
	    long tmp = (X[i]-X[i-1]) * A;
	    if(tmp < B) {
		rest--;
		cost += tmp;
	    }
	}
	cost = cost + rest * B;

	System.out.println(cost);
	scan.close();
    }
}
