import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();

		if(N==1) {
			System.out.println(0);
			return;
		}
		if(N==2) {
			System.out.println(1);
			return;
		}

		long A = (long) 1;
		long B = (long) 2;
		long C = (long) 1;
		long limit = (long) Math.pow(10,9) + 7;

        for(int i = 0; i < N; i++) {
			A *= 10;
			if(A > limit) {
				A = A%limit;
			}
		}
		for(int i = 0; i < N; i++) {
			B *= 9;
			if(B > limit) {
				B = B%limit;
			}
		}
		for(int i = 0; i < N; i++) {
			C *= 8;
			if(C > limit) {
				C = C%limit;
			}
		}
		
		long result = A - B + C;
      	if(result > limit) {
			result = result%limit;
		}
      	if(result < 0) {
			result = result + limit;
		}

		System.out.println(result);
		return;
	}

}
