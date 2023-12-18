import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int N = Integer.parseInt(scanner.next());
	    int[] x = new int[N];
	    int[] y = new int[N];
	    long[] h = new long[N];

	    long[][] ha = new long[101][101];
	    boolean[][] b = new boolean[101][101];

	    for (int i=0; i<N; i++) {
	    	x[i]=Integer.parseInt(scanner.next());
	    	y[i]=Integer.parseInt(scanner.next());
	    	h[i] = Long.parseLong(scanner.next());
	    }

	    for (int i=0; i<101; i++) {
	    	for (int j=0; j<101; j++) {
	    	    b[i][j]=true;
	    	}
	    }

	    for (int i=0; i<N; i++) {
	    	if (h[i] == 0) {
	    		b[x[i]][y[i]] = false;
	    		continue;
	    	}
	    	for (int j=0; j<=100; j++) {
	    		for (int k=0; k<=100; k++) {
	    			if ((ha[j][k] == 0) && (h[i] != 0)) {
			    	    ha[j][k] = Math.abs(x[i] - j) + Math.abs(y[i] - k) + h[i];
	    			}
			    }
		    }
	    }

    	boolean f=false;
	    for (int i=0; i<N; i++) {
	    	for (int j=0; j<=100; j++) {
	    		for (int k=0; k<=100; k++) {
			    	if ((b[j][k] == true)) {
			    		    if(Math.max(ha[j][k] - Math.abs(x[i] - j) - Math.abs(y[i] - k), 0) != h[i]) {
			    	    		b[j][k] = false;
			    		    }
			    	}
			    }
		    }
	    }

	    for (int X=0; X<101; X++) {
	    	for (int Y=0; Y<101; Y++) {
	    		if (b[X][Y] == true) {
	    		    System.out.println(X+ " " + Y + " " + ha[X][Y]);
	    		}
	    	}
	    }
	}

}