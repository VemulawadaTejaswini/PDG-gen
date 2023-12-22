/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();int mul=1;double sum=0;
		for(int i=0;i<N;i++){
		    double a=sc.nextDouble();
		   // mul=mul*a;
		    sum=sum+1/a;
		}
		//double b=(double)sum/(double)mul;
		System.out.println(1/sum);

	}
}