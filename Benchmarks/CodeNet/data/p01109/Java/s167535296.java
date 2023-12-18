import java.util.Scanner;

public class Main {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i, n, sum, avg, count;
	    while(true) {
	    	sum = 0;
	    	avg = 0;
	    	count = 0;
	    	n = sc.nextInt();
	    	if(n == 0)break;
	    	int a[] = new int[n];
	    	for( i = 0; i < n; i++) {
	    		a[i] = sc.nextInt();
		    	sum += a[i];
		    }
	    	avg = sum / n;
	    	for( i = 0; i < n; i++) {
		    	if( a[i] < avg) {
		    		count++;
		    	}
		    }
	    	System.out.println(count);
	    }
        sc.close();
    }
}
