import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] pre = new int[n];
    	for (int i = 0; i < n; i++) {
    		pre[i] = sc.nextInt();
    	}
		int[] in = new int[n];
    	for (int i = 0; i < n; i++) {
    		in[i] = sc.nextInt();
    	}

    	int[] post = new int[n];
    	makePost(post, n - 1, pre, 0, in, 0, n);

    	for (int i = 0; i < n; i++) {
    		if (i != 0) {
            	System.out.print(" ");
    		}
        	System.out.print(post[i]);
    	}
    	System.out.println("");

    	sc.close();
	}
	
	private static void makePost(int[] post, int spost, int[] pre, int spre, int[] in, int sin, int n) {
		if (n < 1) {
			return;
		}
		
		post[spost] = pre[spre];

		int i = sin;
		for (; i < sin + n; i++) {
			if (in[i] == pre[spre]) {
				break;
			}
		}

		makePost(post, spost - 1, pre, spre + 1 + (i - sin), in, sin + 1 + (i -sin), n - (i - sin) - 1);
		makePost(post, spost - 1 - (n - (i - sin) - 1), pre, spre + 1, in, sin, i - sin);
	}
}