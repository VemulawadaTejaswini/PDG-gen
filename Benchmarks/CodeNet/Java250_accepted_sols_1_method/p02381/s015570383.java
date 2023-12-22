
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(true) {
	    	long sum=0;
	    	int n = sc.nextInt();
	    	if(n==0) break;
	    	double a[]= new double[n+1];
	    	for(int i=0;i<n;i++) {
	    		a[i]=sc.nextDouble();
	    		sum += a[i];
	    	}
	    	double m = sum/(double)n;
	    	double suma = 0;
	    	for(int i=0;i<n;i++) {
	    		suma += (a[i]-m)*(a[i]-m);
	    	}
	    	double A = Math.sqrt(suma/n);
	    	String str = String.format("%.10f",A);
	    	System.out.println(str);
    	}
    	
    }
}
