import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
    	int[] l = new int [N];
    	for (int i=0; i < N; i++) {
    		l[i] = stdIn.nextInt();
    	}

    	for (int i=0; i < N-1; i++) {
    	    int max = i;
    	        for (int j=i+1; j < N; j++) {
    		    if (l[max] < l[j]) {
    		        max = j;
    		    }
    		}
    	    int tmp = l[i];
    	    l[i] = l[max];
    	    l[max] = tmp;
    	}

    	int ans = 0;
    	for(int i=0; i < K; i++) {
            ans += l[i];
        }
    	System.out.println(ans);
	}
}
