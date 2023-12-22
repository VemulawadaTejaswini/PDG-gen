import java.util.Scanner;

class Main {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int[] x = new int[a];
       		int[] y = new int[a];
	        for (int i = 0; i < a; i++) {
           		x[i] = sc.nextInt();
        	}
        	for (int j = 0; j < a; j++) {
            		y[j] = sc.nextInt();
        	}

	        double n = 0;
	        double m = 0;
	        double l = 0;
	        double o = 0;
       		for (int i = 0; i < a; i++) {
            		n += Math.abs(x[i] - y[i]);
            		m += Math.pow(Math.abs(x[i] - y[i]), 2);
            		l += Math.pow(Math.abs(x[i] - y[i]), 3);
            		if(o < Math.abs(x[i] - y[i])) {
                		o = Math.abs(x[i] - y[i]);
            		}
        	}
        	m = Math.pow(m, 1.0 / 2.0);
        	l = Math.pow(l, 1.0 / 3.0);
         
        	System.out.println(n);
        	System.out.println(m);
        	System.out.println(l);
        	System.out.println(o);
    	}
}