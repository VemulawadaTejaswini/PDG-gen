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
	    BigInteger biT = (biN.subtract(FOUR)).divide(TWO).add(BigInteger.ONE);
	    //System.out.println( biT );
	    biN=biN.multiply(TWO).multiply(biN).add( biN.multiply(EIGHT) );
	    //System.out.println(biN);
	    biT=biT.multiply(FOUR).multiply(biT.add(BigInteger.ONE));
	    BigInteger ans = biN.subtract( biT );
	    //System.out.println( biT );
	    if(biN.equals(new BigInteger("64")))ans=new BigInteger("64");
	    System.out.println( ans );
	    
	}
    }
}