import java.math.BigInteger;
import java.util.Scanner;

class Main{
    public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	final int n = Integer.parseInt(s.next());

	BigInteger m = new BigInteger("1");
	for(int i = 0; i < n; i++){
	    m = m.multiply(new BigInteger(String.valueOf(i + 2)));
	}

	m = m.add(BigInteger.ONE);
	m = m.add(BigInteger.ONE);

	System.out.println(m);

	for(int i = 0; i < n; i++){
	    System.out.println(i + 2);
	    // System.out.println(m.mod(new BigInteger(String.valueOf(i + 2))));
	    // m = m.add(BigInteger.ONE);
	}
    }
}