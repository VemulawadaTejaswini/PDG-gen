
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int n, i, k = 0;
        int[] s;
        double sum, avg, a;
        double[] b = new double[100];
        
        while((n = sc.nextInt()) != 0) {
        	a = 0;
        	sum = 0;
        	s = new int[n];
        	for(i = 0; i < n; i++) {
        		s[i] = sc.nextInt();
        		sum += s[i];
        	}
        	avg = sum / n;
        	for(i = 0; i < n; i++) {
        		a += (avg - s[i]) * (avg - s[i]);
        	}
        	b[k] = a / n;
        	k++;
        }
        
        for(i = 0; i < k; i++) {
        	b[i] = Math.sqrt(b[i]);
        	System.out.print(b[i]);
        	//System.out.print(String.format("%.8f", b[i]));
        	if(i != k-1) System.out.println();
        }
    }
}
