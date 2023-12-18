import java.util.*;

class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
      	int K = sc.nextInt();
        long[] a = new long[K];
      	a[0] = 7 % K;
      	
        
        for (int i = 1; i < K; i++) {
        	a[i] = (10 * a[i-1] + 7) % (long)K;
        }
		for (int i = 0; i < K; i++) {
        	if (a[i] == 0) {
            	counter = i + 1;
              	break;
            }
        }  
      	if (counter == 0) {counter = -1;}
      	System.out.println(counter);
	}	
}