import java.math.BigInteger;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int MOD = 998244353;
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int q = sc.nextInt();
	    StringBuffer sb = new StringBuffer(n);
	    for (int i = 0; i < n; i++) {
	    	sb.append("1");
	    }

	    for (int i = 0; i < q; i++) {
	    	int l = sc.nextInt();
	    	int r = sc.nextInt();
	    	int d = sc.nextInt();
	    	for (int j = l - 1; j < r; j++) {
	    		sb.replace(j, j+1, String.valueOf(d));
	    	}
	    	BigInteger bi = new BigInteger(sb.toString());
	    	BigInteger BI_MOD = new BigInteger("998244353");
	    	System.out.println(bi.remainder(BI_MOD));
	    }
	}

}