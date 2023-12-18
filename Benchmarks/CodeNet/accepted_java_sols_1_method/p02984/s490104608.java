import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	long[] A = new long[N];
	long sum = 0;
	for (int i = 0; i < N; i++) {
	    A[i] = in.nextLong();
	    sum += A[i];
	}
	long[] X = new long[N];
	long harfSum = 0;
	for (int i = 1; i < N - 1; i += 2) {
	    harfSum += A[i];
	}
	X[0] = sum - harfSum * 2;
	for (int i = 0; i < N - 1; i++) {
	    X[i + 1] = 2 * A[i] - X[i];
	}
	System.out.println(LongStream.of(X)
			   .mapToObj(String::valueOf)
			   .collect(Collectors.joining(" ")));
    }
}