import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		int d = sc.nextInt();
    		double e = sc.nextDouble();
    		if(d==0 && e==0) break;
    		double min = 150.0;
    		for(int i=0;i<=d;i++) {
    			double l = Math.sqrt((double)(i*i + (d-i)*(d-i)));
    			double b = Math.abs(e-l);
    			if(b<min) min = b;
    		}
    		System.out.printf("%.10f", min);
    		System.out.println();
    	}
    }
}

