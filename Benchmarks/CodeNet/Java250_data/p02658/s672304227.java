import java.util.*;
import java.math.BigInteger;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigInteger bi = BigInteger.ONE;
		for(int i=0; i<N; i++){
			BigInteger next = sc.nextBigInteger();
			if(!bi.equals(BigInteger.valueOf(-1))){
				if(bi.multiply(next).compareTo(BigInteger.valueOf(1000000000000000000L)) > 0){
					bi =  BigInteger.valueOf(-1);
				}else{
					bi = bi.multiply(next);
				}
			}else if(next.equals(BigInteger.ZERO)){
				bi = BigInteger.valueOf(0);
			}
		}
		System.out.print(bi);
	}
}

