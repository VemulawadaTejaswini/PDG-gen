import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String fst = br.readLine();
			int n = Integer.parseInt(fst);
			if(n==0){break;}
			String line = br.readLine();
			String[] str = line.split(" ");
			double[] s = new double[str.length];
			for (int j = 0; j<n ; j++ ) {
				s[j] = Double.parseDouble(str[j]);
			}

			double sum = 0.0;
			for (int j = 0; j<n ; j++ ) {
				sum += s[j];
			}
			double num = n;
			double avr = sum/num;
			double a = 0.0;
			for (int j = 0; j<n ; j++) {
				a += (s[j]-avr)*(s[j]-avr);		
			}
			a /= num;
			a = Math.sqrt(a);
			System.out.printf("%.6f\n",a);
		}
	}
}