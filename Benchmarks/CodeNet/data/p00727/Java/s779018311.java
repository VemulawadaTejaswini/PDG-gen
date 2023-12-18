import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main{

	int N;
	final int MESH = 1200;
	final double diameter = 2.0;
	final double EPS = 1e-11;
	Point[] ps;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			N = in.nextInt();
			if(N==0) return ;
			ps = new Point[N];
			for(int i=0; i<N; i++){
				double x = in.nextDouble(), y = in.nextDouble();
				ps[i] = new Point(x,y);
			}
			//System.out.printf("%.30f\n%.30f\n",calc(0.982793716918266), calc(0.982793723247329));
			System.out.printf("%.15f\n", solve(true));
			System.out.printf("%.15f\n", solve(false));
		}
	}

	double calc(double theta){
		double[] xs = new double[N];
		for(int i=0; i<N; i++){
			//Point proj = projection(ps[i], new Point(sin(theta), cos(theta)));
			//xs[i] = proj.rot(-(PI/2-theta)).x;
			xs[i] = ps[i].x*sin(theta) + ps[i].y*cos(theta);
		}
		return rangeMerge(xs);
	}

	double rangeMerge(double[] xs){
		Arrays.sort(xs);
		/*
		double ret = diameter;
		for(int i=0; i<N-1; i++){
			ret += diameter - max(0.0, (xs[i] + diameter) - xs[i+1]);
		}
		return ret;
		*/
		double ret = 0.0;
		double[] dif = new double[N-1];
		for(int i=0; i<N-1; i++){
			dif[i] = max(0.0, (diameter - xs[i+1]) + xs[i]);
		}
		Arrays.sort(dif);
		for(double d:dif){
			ret -= d;
		}
		return ret;
	}

	double solve(boolean findMin){
		double lb = 0.0, ub = PI, bestValue = findMin?Double.MAX_VALUE:-Double.MAX_VALUE, center = 0.0;
		while(ub-lb>EPS){
			double width = (ub - lb)/MESH;
			for(int i=0; i<MESH; i++){
				double result = calc(lb + width*i);
				if(findMin ^ (result > bestValue)){
					center = lb + width*i;
					bestValue = result;
				}
			}
			lb = center - 2.0*width;
			ub = center + 2.0*width;
		}
		return center;
	}

	//p -> line((0,0)->q with length=1)
	Point projection(Point p, Point q){
		return q.multi(p.iprod(q));
	}

	class Point{
		double x, y;
		Point(double _x, double _y){
			this.x = _x; this.y = _y;
		}
		Point add(Point a){
			return new Point(x + a.x, y + a.y);
		}
		Point sub(Point a){
			return new Point(x - a.x, y - a.y);
		}
		Point multi(double a){
			return new Point(a*x, a*y);
		}
		double iprod(Point a){
			return x*a.x + y*a.y;
		}
		Point rot(double theta){
			return new Point(x*cos(theta) - y*sin(theta), x*sin(theta) + y*cos(theta));
		}
	}

	class Range{
		double left, right;
		Range(double l, double r){
			this.left = l; this.right = r;
		}
	}

	public static void main(String args[]){
		new Main().run();
	}
}