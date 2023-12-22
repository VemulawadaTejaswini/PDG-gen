import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    long[] a = new long[n+1];
		    long[] b = new long[n];
		    for(int i=0; i<n+1; i++) {
		    	a[i] = sc.nextInt();
		    }
		    for(int i=0; i<n; i++) {
		    	b[i] = sc.nextInt();
		    }

		    long monster =0;
		    for(int i=n-1; i>=0; i--) {
		    	if(b[i]-a[i+1]>=0) {
		    		monster += a[i+1];
		    		b[i] = b[i]-a[i+1];
		    		if(b[i]-a[i]>=0) {
		    			monster +=a[i];
		    			a[i] = 0;
		    		}else {
		    			monster += b[i];
		    			a[i] = a[i]-b[i];
		    		}
		    	}else {
		    		monster += b[i];
		    	}
		    }

		    System.out.println(monster);
	}
}
