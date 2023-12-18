
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int n, i;
        int[] x, y;
        double p1 = 0, p2 = 0, p3 = 0, max = 0;
        
        n = sc.nextInt();
        x = new int[n];
        y = new int[n];
        for(i = 0; i < n; i++) {
        	x[i] = sc.nextInt();
        }
        for(i = 0; i < n; i++) {
        	y[i] = sc.nextInt();
        }
        
        for(i = 0; i < n; i++) {
        	p1 += Math.abs(x[i] - y[i]);
        	p2 += (x[i] - y[i]) * (x[i] - y[i]);
        	p3 += Math.abs(x[i] - y[i]) * (x[i] - y[i]) * (x[i] - y[i]);
        	if(max < Math.abs(x[i] - y[i])) {
        		max = Math.abs(x[i] - y[i]);
        	}
        }
        
        System.out.println(p1);
        System.out.println(Math.sqrt(p2));
        System.out.println(Math.cbrt(p3));
        System.out.println(max);
        
    }
}
