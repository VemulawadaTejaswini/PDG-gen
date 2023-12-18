import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		for(;sc.hasNextDouble();){

			double xa = sc.nextDouble();

			double ya = sc.nextDouble();

			double xb = sc.nextDouble();

			double yb = sc.nextDouble();

			double xc = sc.nextDouble();

			double yc = sc.nextDouble();

			double xd = sc.nextDouble();

			double yd = sc.nextDouble();

			System.out.println(Math.abs((xa-xb)*(xc-xd)+(ya-yb)*(yc-yd))<0.00001?"YES":"NO");

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}