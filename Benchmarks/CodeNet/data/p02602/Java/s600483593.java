import java.util.*;
import java.math.*;

class Main {
    private static long[] grades = new long[200000 + 5];

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int k = s.nextInt();

	for (int i = 0; i < n; i++) {
	    grades[i] = s.nextLong();
	}

	BigInteger mul = BigInteger.ONE;
	int i;
	for (i = 0; i < k; i++) {
	    mul = mul.multiply(BigInteger.valueOf(grades[i]));
	}
	// System.out.println("Mul upto k is " + mul.toString());
	for (; i < n; i++) {
	    BigInteger curMul = mul.multiply(BigInteger.valueOf(grades[i])).divide(BigInteger.valueOf(grades[i - k]));
	    // System.out.println("Next mul is " + curMul.toString());
	    if (curMul.compareTo(mul) > 0) {
		System.out.println("Yes");
	    } else {
		System.out.println("No");
	    }
	    mul = curMul;
	}
    }
}
