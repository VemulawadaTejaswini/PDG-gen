import java.lang.*;
import java.math.*;

import java.util.*;

class Main{
    public static void main(String s[]){
	Scanner sc = new Scanner(System.in);
	BigInteger TWO=new BigInteger("2");
	BigInteger FOUR=new BigInteger("4");
	BigInteger EIGHT=new BigInteger("8");
	while(true){
	    BigInteger biN = sc.nextBigInteger();
	    if( biN.equals( BigInteger.ZERO)  ) break;
	    BigInteger biR = biN.divide(TWO).subtract(BigInteger.ONE);
	    BigDecimal pi = new BigDecimal("3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679");
	    BigDecimal Area = pi.multiply( new BigDecimal(biR) ).multiply( new BigDecimal(biR) );
	    BigInteger ans = biN.multiply(biN).multiply(TWO).add(EIGHT.multiply(biN).subtract( Area.toBigInteger().divide(FOUR) ) );
	    System.out.println( ans );
	    
	}
    }
}