import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int N = sc.nextInt();
    		int[][] v = new int[N][3];

    		for (int i=0; i<N; i++) {
    			v[i][0] = sc.nextInt();
    			v[i][1] = sc.nextInt();
    			v[i][2] = sc.nextInt();
    		}

    		int[][] h = new int[N][3];
    		h[0][0] = v[0][0];
    		h[0][1] = v[0][1];
    		h[0][2] = v[0][2];

    		for (int i=1; i<N; i++) {
    			h[i][0] = Math.max(h[i-1][1] + v[i][0], h[i-1][2] + v[i][0]);
    			h[i][1] = Math.max(h[i-1][0] + v[i][1], h[i-1][2] + v[i][1]);
    			h[i][2] = Math.max(h[i-1][0] + v[i][2], h[i-1][1] + v[i][2]);
    		}

    		if (h[N-1][0] < h[N-1][1]) {
    			if (h[N-1][1] < h[N-1][2]) {
    				System.out.println(h[N-1][2]);
    			} else {
    				System.out.println(h[N-1][1]);
    			}
    		} else {
    			if (h[N-1][0] < h[N-1][2]) {
    				System.out.println(h[N-1][2]);
    			} else {
    				System.out.println(h[N-1][0]);
    			}
    		}

    	} finally {
    		sc.close();
    	}
    }
}

