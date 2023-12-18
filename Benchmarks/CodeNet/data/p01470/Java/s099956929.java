
import java.util.Scanner;
import java.math.BigInteger;

public class Main{
    public static void main(String [] args){
	Scanner in = new Scanner(System.in);

	int n = in.nextInt();
	BigInteger ue   = BigInteger.ZERO;
	BigInteger sita = BigInteger.ONE;

	for(int i = 0; i < n; ++i){
	    int o = in.nextInt();
	    int y = in.nextInt();
	    BigInteger yy = new BigInteger(String.valueOf(y));

	    if(o == 1){ // +
		ue = ue.add(sita.multiply(yy));
	    }else if(o == 2){ // -
		ue = ue.subtract(sita.multiply(yy));
	    }else if(o == 3){ // *
		ue   = ue.multiply(yy);
	    }else if(o == 4){
		sita = sita.multiply(yy);
	    }

	    if(i % 1000 == 0 || i == n - 1){
		BigInteger gcd = ue.gcd(sita);
		ue   = ue.divide(gcd);
		sita = sita.divide(gcd);
	    }
	}
	System.out.println("" + ue);
    }
}