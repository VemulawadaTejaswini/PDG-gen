package CodeForces;

import java.util.Scanner;

public class Main {
	public static void funct(int d,int t,int s) {
		double time=(double)d/(double)s;
		if(time<=t) {
			System.out.println("Yes");
		}
		else {
		System.out.println("No");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int t=sc.nextInt();
		int s=sc.nextInt();
		funct(d,t,s);
	}

}
