import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		int[] h = new int[N];
    		for (int i=0; i<N; i++) {
    			h[i] = sc.nextInt();
    		}
    		int[] costs = new int[N];
    		costs[0] = 0;
    		costs[1] = Math.abs(h[1] - h[0]);
    		for (int i=2; i<N; i++) {
    			costs[i] = Math.min(costs[i-1] + Math.abs(h[i] - h[i-1]), costs[i-2] + Math.abs(h[i] - h[i-2]));
    		}
    		System.out.println(costs[N-1]);

    	} finally {
    		sc.close();
    	}
    }
}

