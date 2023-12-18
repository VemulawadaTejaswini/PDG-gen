import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	class position{

		double x;

		double y;

		double dist(position p){

			return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));

		}

		position(String str){

			Scanner in = new Scanner(str.replace(',', ' '));

			x = in.nextDouble();

			y = in.nextDouble();

		}

	}

	void run(){

		position org = new position(sc.nextLine());

		position a = org;

		position b = org;

		double sum = 0;

		for(;sc.hasNextLine();){

			a = new position(sc.nextLine()); 

			

			double z=(org.dist(a)+org.dist(b)+a.dist(b))/2;

			sum += Math.sqrt(z*(z-org.dist(a))*(z-org.dist(b))*(z-a.dist(b)));

			b = a;

		}

		System.out.println(sum);

		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}