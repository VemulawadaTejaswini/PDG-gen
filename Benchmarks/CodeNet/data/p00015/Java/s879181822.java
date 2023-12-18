import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();
	for (int i = 0; i < N; i++) {
	    String a = scanner.next(), b = scanner.next();
	    BigInteger sum = new BigInteger(a), A = new BigInteger(b);
	    sum.add(A);
	    String n_80 = "1";
	    for (int j = 0; j < 79; j++) {
		n_80 += "0";
	    }
	    BigInteger N_80 = new BigInteger(n_80);
	    if (sum.compareTo(N_80) >= 0) {
		System.out.println("overflow");
	    }
	    else {
		System.out.println(sum.toString());
	    }
	}
    }
}