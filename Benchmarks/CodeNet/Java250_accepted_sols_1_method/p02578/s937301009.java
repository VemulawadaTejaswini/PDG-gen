import java.math.BigInteger;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		BigInteger a = new BigInteger("0");
		int b = 0;
		
		for(int i=0; i<N; i++) {
			A[i] = in.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			if(!(i == 0) && A[i-1] > A[i]){
				b = A[i-1] - A[i];
				A[i] += b;
				a = a.add(BigInteger.valueOf(b));
				b = 0;
			}
		}
		
		System.out.println(a);
	}
}
