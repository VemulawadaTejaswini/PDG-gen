import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    int[] B = new int[N];
	    
	    for (int i = 0; i < N - 1; i++) {
	    	B[i] = Integer.parseInt(scanner.next());
	    }
	    
	    int sum = 0;
	    
	    for (int i = 0; i < N; i++) {
	    	if (i == 0) {
	    		sum += B[i];
	    	} else if (i == N-1) {
	    		sum += B[N-2];
	    	} else {
	    		sum += Math.min(B[i], B[i-1]);
	    	}
	    }

        System.out.print(sum);
	}
}
