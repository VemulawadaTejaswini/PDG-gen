import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] B = new int[N-1];
		long sum = 0;
		B[0] = stdIn.nextInt();
		sum += B[0];
		
		for(int i = 1; i < N-1; i++) {
			B[i] = stdIn.nextInt();
			if(B[i-1] >= B[i]) sum += B[i];
			else sum += B[i-1];
		}
		sum += B[N-2];
		
		System.out.println(sum);

	}

}