import java.util.*;
import java.math.*;

class Main {
    void solve () {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt(), m = in.nextInt(), r = in.nextInt();
	BigInteger a = BigInteger.ONE;
	int R = r - n * m;
	if(R < 0) {
	    System.out.println(0);
	    return ;
	}
	for(int i = 0; i < n-1; ++i) {
	    a = a.multiply(BigInteger.valueOf(R + n - i - 1)).divide(BigInteger.valueOf(i+1));
	}
	System.out.println(a.toString());
    }
    public static void main(String[] args) {
	(new Main()).solve();
    }
}