import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			if(m == 0) break;
			double[] x = new double[m];
			double[] y = new double[m];
			int sum = 0;
			for(int i = 0; i < m-1; i++) {
				sum += sc.nextInt();
				double rad = Math.toRadians(sum);
				y[i] = Math.cos(rad);
				x[i] = Math.sin(rad);
			}
			x[m-1] = x[0];
			y[m-1] = y[0];
			double sumx = 0;
			for(int i = 0; i < m-1; i++) {
				sumx += (x[i] - x[i+1]) * (y[i] + y[i+1]);
			}
			if(sumx < 0) {
				sumx *= -1;
			}
			sumx /= 2;
			int n = sc.nextInt();
			x = new double[n];
			y = new double[n];
			sum = 0;
			for(int i = 0; i < n-1; i++) {
				sum += sc.nextInt();
				double rad = Math.toRadians(sum);
				y[i] = Math.cos(rad);
				x[i] = Math.sin(rad);
			}
			x[n-1] = x[0];
			y[n-1] = y[0];
			double sumy = 0;
			for(int i = 0; i < n-1; i++) {
				sumy += (x[i] - x[i+1]) * (y[i] + y[i+1]);
			}
			if(sumy < 0) {
				sumy *= -1;
			}
			sumy /= 2;
			
			if(Math.abs(sumy - sumx) <= 1.0e-9) {
				System.out.println(0);
			}
			else if(sumx < sumy) {
				System.out.println(2);
			}
			else {
				System.out.println(1);
			}
			
			
		}
	}
	

}