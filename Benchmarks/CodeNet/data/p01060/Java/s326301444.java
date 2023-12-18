import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int in = 0;
		int out = 0;
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    if (x == 0) {
		        out++;
		    } else {
		        in++;
		    }
		    if (out < w - 1) {
		        if (in == out) {
		            count++;
		        }
		    } else if (out > w - 1 && out < w - 1 + h - 1) {
		        if (in + 2 == out) {
		            count++;
		        }
		    } else if (out > w - 1 + h - 1) {
		        if (in + 4 == out) {
		            count++;
		        }
		    }
		}
	    System.out.println(count);
	}
}

