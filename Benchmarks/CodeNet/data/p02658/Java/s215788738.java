import java.util.*;
public class Main {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		//input integer
		int N = sc.nextInt();
		long A[] = new long[N];
		long result = 1;
		for(int i=0; i<N; i++) {
			A[i] = sc.nextLong();
			result = result*A[i];
			//System.out.println(result);
		}
		if(result>Math.pow(10, 18)) {result = -1;};
		System.out.println(result);
		sc.close();
	}
}