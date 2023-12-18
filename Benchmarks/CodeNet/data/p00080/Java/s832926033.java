import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		for(;;){

			int n = sc.nextInt();

			if(n == -1) break;

			double x = (double)n/2;

			for(;Math.abs(x*x*x - n) > 0.00001*n;){

				x = x-(x*x*x-n)/(3*x*x);

			}

			System.out.println((int)x + Double.toString(x-(int)x).substring(1,8));

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}