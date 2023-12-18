import java.util.*;
import java.math.*;

class MSol {
    private static long[] grades = new long[200000 + 5];

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int k = s.nextInt();

	for (int i = 0; i < n; i++) {
	    grades[i] = s.nextLong();
	}

	int i = k;

	for (; i < n; i++) {
	    if (grades[i - k] < grades[i]) {
		System.out.println("Yes");
	    } else {
		System.out.println("No");
	    }
	}
    }
}
