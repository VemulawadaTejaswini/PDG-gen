import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
    	BigInteger BI_MOD = new BigInteger("998244353");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int q = sc.nextInt();
	    StringBuffer sb = new StringBuffer(n);
    	sb.append(String.join("", Stream.generate(() -> "1" ).limit(n).collect(Collectors.toList())));

	    for (int i = 0; i < q; i++) {
	    	int l = sc.nextInt();
	    	int r = sc.nextInt();
	    	String d = String.valueOf(sc.nextInt());
	    	//for (int j = l - 1; j < r; j++) {
	    		sb.replace(l - 1, r - 1, String.join("", Stream.generate(() -> d ).limit(r - l).collect(Collectors.toList())));
	    	//}
	    	BigInteger bi = new BigInteger(sb.toString());
	    	System.out.println(bi.remainder(BI_MOD));
	    }
	}

}