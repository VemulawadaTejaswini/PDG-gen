import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    long K = Long.parseLong(scanner.next());
	    int Q = Integer.parseInt(scanner.next());
	    int[] A  = new int[Q];
	    int[] num = new int[N];

	    for (int i=0; i<Q; i++) {
	        A[i]= Integer.parseInt(scanner.next());
	        num[A[i]-1]++;
	    }

        for (int i=0; i<N; i++) {
	        if (K - Q + num[i] > 0) {
	        	System.out.println("Yes");
	        }else {
	        	System.out.println("No");
	        }
	    }

	}

}