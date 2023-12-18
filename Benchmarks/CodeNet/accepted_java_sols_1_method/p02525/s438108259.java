import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int n;
		double k = 0;
		double m;
		while(i == 0){
			n = sc.nextInt();
			
			if(n==0){
				break;
			}
			m = 0;
			
			double[] s = new double[n];
			for(j=0;j<n;j++){
				s[j] = sc.nextDouble();
				m = m + s[j];
			}
			j = 0;
			m = m/(double)n;
			
			for(j=0;j<n;j++){
				k = k + Math.pow((s[j] - m),2);
			}
			
			System.out.println(Math.sqrt(k/n));
			j = 0;
			k = 0;
		}
	}
}