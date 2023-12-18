import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	class point{

		double x;

		double y;

		point(double x, double y){

			this.x = x;

			this.y = y;

		}

		point rot(point arg){

			point sc = arg.norm();

			double sin = sc.y;

			double cos = sc.x;

			point ret = new point(0,0);

			ret.x = x*cos - y*sin;

			ret.y = x*sin + y*cos;

			return ret;

		}

		point rot_inv(point arg){

			point s = new point(arg.x,-arg.y);

			return rot(s);

		}

		

		double abs(){

			return Math.sqrt(x*x+y*y);

		}

		point norm(){

			return new point(x/abs(),y/abs());

		}

		point org(point orgin){

			return new point(this.x-orgin.x,this.y-orgin.y);

		}

		point  add(point p){

			return new point(x+p.x,y+p.y);

		}

	}

	

	Scanner sc = new Scanner(System.in);

	void run(){

		for(;sc.hasNextLine();){

			String buffer =sc.nextLine();

			Scanner in = new Scanner(buffer.replace(',', ' '));

			point a = new point(in.nextDouble(),in.nextDouble());

			point b = new point(in.nextDouble(),in.nextDouble());

			point p = new point(in.nextDouble(),in.nextDouble());

			point orged_b = b.org(a);

//			System.out.println(orged_b.x+" "+orged_b.y);

			point orged_p = p.org(a);

//			System.out.println(orged_p.x+" "+orged_p.y);

			point roted_p = orged_p.rot_inv(orged_b);

//			System.out.println(roted_p.x+" "+roted_p.y);

			point roted_syn_p = new point(roted_p.x, -roted_p.y);

//			System.out.println(roted_syn_p.x+" "+roted_syn_p.y);

			point orged_syn_p = roted_syn_p.rot(orged_b);

//			System.out.println(orged_syn_p.x+" "+orged_syn_p.y);

			point syn_p = orged_syn_p.add(a);

			System.out.println(syn_p.x+" "+syn_p.y);

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}