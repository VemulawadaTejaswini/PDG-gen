import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String fst = br.readLine();
		int n = Integer.parseInt(fst);
		double[] x = new double[n]; 
		double[] y = new double[n]; 
		String[] linex = (br.readLine()).split(" ");
		String[] liney = (br.readLine()).split(" ");
		for (int i = 0; i<n ; i++ ) {
			x[i] = Double.parseDouble(linex[i]);
			y[i] = Double.parseDouble(liney[i]);
		}
		Double sum = 0.0;
		double p = 1;
		for (int i =0; i<n ;i++ ) {
			sum += Math.pow(Math.abs(x[i]-y[i]),p);
		}

		Double d = Math.pow(sum,(1/p));
		System.out.printf("%.6f\n",d);

		sum = 0.0;
		p = 2;
		for (int i =0; i<n ;i++ ) {
			sum += Math.pow(Math.abs(x[i]-y[i]),p);
		}

		d = Math.pow(sum,(1/p));
		System.out.printf("%.6f\n",d);

		sum = 0.0;
		p = 3;
		for (int i =0; i<n ;i++ ) {
			sum += Math.pow(Math.abs(x[i]-y[i]),p);
		}

		d = Math.pow(sum,(1/p));
		System.out.printf("%.6f\n",d);

		double max = 0.0;
		for (int i =0; i<n ;i++ ) {
			max = Math.max(max,Math.abs(x[i]-y[i]));
		}
		System.out.printf("%.6f\n",max);
	}
}