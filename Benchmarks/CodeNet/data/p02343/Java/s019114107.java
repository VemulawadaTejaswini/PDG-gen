import java.util.*;
import java.io.*;

class Main {
	static PrintStream out = System.out;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
	    int[] v = new int[n+1];
	    for (int i = 0; i <= n; i++) {
	        v[i] = i;
	    }
	    int q = in.nextInt();
	    
	    for (int i = 0; i < q; i++) {
	        int com = in.nextInt();
	        int x = in.nextInt();
	        int y = in.nextInt();
	        if (x > y) {
	            int tmp = x;
	            x = y;
	            y = tmp;
	        }
	        if (com == 0) {
	            int tmp = v[y];
	            for (int j = 0; j <= n; j++) {
	                if (v[j] == tmp) {
	                    v[j] = v[x];
	                }
	            }
	        } else {
	            out.println(v[x] == v[y] ? 1 : 0);
	        }
	    }
	}
}