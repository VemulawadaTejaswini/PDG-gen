import java.util.*;
import java.math.BigInteger;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		BigInteger bi = BigInteger.ONE;
		for(int i=0; i<N; i++){
			if(bi.compareTo(BigInteger.valueOf(1000000000000000000L)) > 0){
				System.out.print(-1);
				return;
			}else{
				bi = bi.multiply(sc.nextBigInteger());
			}
		}
		System.out.print(bi);
	}
}

