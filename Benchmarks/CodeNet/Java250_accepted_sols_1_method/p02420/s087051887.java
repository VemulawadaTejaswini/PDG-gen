import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i, j, k, n, m, l;
        while(true) {
        	String d = sc.next();
	        char[] a = d.toCharArray();
	        if(d.equals("-"))break;
	        n = a.length;
	        char[] c = new char[n];
	        m = sc.nextInt();
	        for(i = 0; i < m; i++) {
	        	k = 0;
	        	l = sc.nextInt();
		        char[] b = new char[l];
	        	for(j = 0; j < l; j++) {
		        	b[j] = a[j];
		        }
		        for(j = l; j < n; j++) {
			    	c[k] = a[j];
			    	k++;
			    }
		        for(j = 0; j < l; j++) {
			        c[k] = b[j];
			        k++;
			    }
		        for(j = 0; j < n; j++) {
		        	a[j] = c[j];
		        }
	        }
	        for(i = 0; i < n; i++) {
	        	System.out.print(a[i]);
	        }
        	System.out.println();
        }
        sc.close();
    }
}
