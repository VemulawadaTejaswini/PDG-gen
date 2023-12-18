import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;

public class Main{
    public static void main(String [] args) throws java.io.IOException{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	int n = Integer.parseInt(in.readLine());
	BigInteger ue   = BigInteger.ZERO;
	BigInteger sita = BigInteger.ONE;

	for(int i = 0; i < n; ++i){
	    int o = Integer.parseInt(String.valueOf((char)in.read()));
	    in.read();
	    BigInteger yy = new BigInteger(in.readLine());

	    if(o == 1){ // +
		ue = ue.add(sita.multiply(yy));
	    }else if(o == 2){ // -
		ue = ue.subtract(sita.multiply(yy));
	    }else if(o == 3){ // *
		ue   = ue.multiply(yy);
	    }else if(o == 4){
		sita = sita.multiply(yy);
	    }

	    if(i % 100 == 0 || i == n - 1){
		BigInteger gcd = ue.gcd(sita);
		ue   = ue.divide(gcd);
		sita = sita.divide(gcd);
	    }
	}
	System.out.println("" + ue);
    }
}