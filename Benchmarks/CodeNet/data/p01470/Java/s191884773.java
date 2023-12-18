import java.util.Scanner;
import java.math.BigInteger;

public class AOJ2353{
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
		BigInteger gcd = yy.gcd(sita);
		ue   = ue.multiply(yy.divide(gcd));
		sita = sita.divide(gcd);
	    }else if(o == 4){
		BigInteger gcd = yy.gcd(ue);
		sita = sita.multiply(yy.divide(gcd));
		ue   = ue.divide(gcd);
	    }
	    // System.out.println(ue + " " + sita);
	}
	System.out.println("" + ue);
    }
}