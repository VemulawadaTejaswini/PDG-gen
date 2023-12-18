import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();
		long A[] = new long[N];
		boolean zero = false;
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextLong();
			if(A[i] == 0){
				zero = true;
			}
		}
		if(zero){
			System.out.println(0);
		}else{
			long limit = 1000000000000000000L;
			BigInteger LIM = BigInteger.valueOf(limit);
			BigInteger ret = BigInteger.ONE;
			boolean overflow = false;
			for(long a : A){
				if(a == 1){
					continue;
				}
				ret = ret.multiply(BigInteger.valueOf(a));
				if(ret.compareTo(LIM) > 0){
					overflow = true;
					break;
				}
			}
			if(overflow){
				System.out.println(-1);
			}else{
				System.out.println(ret.toString());
			}
		}
	}
}
