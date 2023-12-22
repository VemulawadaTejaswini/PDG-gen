import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int[] a = new int[n+1];
		    int[] b = new int[n];
		    for(int i=0; i<n+1; i++) {
		    	a[i] = sc.nextInt();
		    }
		    for(int i=0; i<n; i++) {
		    	b[i] = sc.nextInt();
		    }

		    long monster =0;
		    for(int i=0; i<n; i++) {
		    	if(b[i]<a[i]) {
		    		monster += b[i];
		    	} else {
		    		monster += a[i];
		    		b[i] -= a[i];
		    		if(b[i]>=a[i+1]) {
		    			monster += a[i+1];
		    			a[i+1] = 0;
		    		} else {
		    			monster += b[i];
		    			a[i+1] -= b[i];
		    		}
		    	}
		    }

		    System.out.println(monster);
	}
}
