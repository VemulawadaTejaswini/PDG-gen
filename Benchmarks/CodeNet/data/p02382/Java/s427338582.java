package icpc;

import java.util.Scanner;

public class icpc {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	double x[] = new double[101];
    	double y[] = new double[101];
    	double p1=0,p2=0,p3=0,pm=0;
    	
    	double n = sc.nextDouble();
    	for(int i=0;i<n;i++) {
    		x[i]=sc.nextDouble();
    	}
    	for(int i=0;i<n;i++) {
    		y[i]=sc.nextDouble();
    	}
	    
    	for(int i=0;i<n;i++) {
    		p1 += Math.abs(x[i]-y[i]);
    		p2 += (x[i]-y[i])*(x[i]-y[i]);
    		p3 += Math.abs(x[i]-y[i])*(x[i]-y[i])*(x[i]-y[i]);
    		pm = Math.max(pm, Math.abs(x[i]-y[i]));
    	}
    	
    	System.out.printf("%.10f\n",p1);
    	System.out.printf("%.10f\n",Math.sqrt(p2));
    	System.out.printf("%.10f\n",Math.cbrt(p3));
    	System.out.printf("%.10f\n",pm);
    	
    }
}
