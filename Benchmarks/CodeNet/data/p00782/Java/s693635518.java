import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	int n;
	R[] rs;
	int caze;

	void run(){
		for(caze=1;; caze++){
			n=sc.nextInt();
			if(n==0){
				break;
			}
			rs=new R[n];
			for(int i=0; i<n; i++){
				double x=sc.nextDouble();
				double y=sc.nextDouble();
				double r=sc.nextDouble();
				rs[i]=new R(x-r, y-r, x+r, y+r);
			}
			solve();
		}
	}

	void solve(){
		TreeSet<Double> setX=new TreeSet<Double>();
		for(int i=0; i<n; i++){
			setX.add(rs[i].x1);
			setX.add(rs[i].x2);
		}
		Double[] xs=setX.toArray(new Double[0]);
		sort(xs);
		int m=xs.length;
		@SuppressWarnings("unchecked")
		TreeSet<R>[] setR=new TreeSet[m];
		for(int i=0; i<m; i++){
			setR[i]=new TreeSet<R>();
		}
		// setR[0].add(rs[0]);
		for(int i=0; i<n; i++){
			setR[binarySearch(xs, rs[i].x1)].add(rs[i]);
		}
		for(int j=0; j<m-1; j++){
			for(R r : setR[j]){
				if(xs[j+1]+EPS<r.x2){
					setR[j+1].add(r);
				}
			}
		}
		for(int j=0; j<m; j++){
			debug("j", j, "x", xs[j]);
			for(R r : setR[j]){
				debug(r.x2, r.y1, r.y2);
			}
			debug();
		}
		double sum=0;
		for(int k=0; k<m-1; k++){
			LinkedList<Double> seg=new LinkedList<Double>();
			for(R r : setR[k]){
				int i=seg.size(), j=seg.size();
				for(int p=seg.size()-1; p>=0; p--){
					double y=seg.get(p);
					if(y>=r.y2){
						j=p;
					}
					if(y>=r.y1){
						i=p;
					}
				}
				for(int p=i; p<j; p++){
					seg.remove(i);
				}
				if(j%2==0){
					seg.add(i, r.y2);
				}
				if(i%2==0){
					seg.add(i, r.y1);
				}
			}
			double len=0;
			for(int i=0; i<seg.size(); i+=2){
				len=seg.get(i+1)-seg.get(i);
			}
			sum+=len*(xs[k+1]-xs[k]);
		}
		debug(sum);
		println(String.format("%d %.2f", caze, sum+0.005+EPS));
	}

	void test(){
		double[] x1={1, 3, 4, 1.0, 6., 11, 9.50};
		double[] x2={2, 4, 5, 2.5, 10, 12, 10.5};
		LinkedList<Double> seg=new LinkedList<Double>();
		for(int k=0; k<x1.length; k++){
			int i=seg.size(), j=seg.size();
			for(int p=seg.size()-1; p>=0; p--){
				double x=seg.get(p);
				if(x>=x2[k]){
					j=p;
				}
				if(x>=x1[k]){
					i=p;
				}
			}
			debug("x1", "x2", x1[k], x2[k]);
			debug("i", "j", i, j);
			for(int p=i; p<j; p++){
				seg.remove(i);
			}
			if(j%2==0){
				seg.add(i, x2[k]);
			}
			if(i%2==0){
				seg.add(i, x1[k]);
			}
			debug(seg.toArray());
		}
		debug(seg.toArray());
	}

	class R implements Comparable<R>{
		double x1, y1, x2, y2;

		R(double x1, double y1, double x2, double y2){
			this.x1=x1;
			this.y1=y1;
			this.x2=x2;
			this.y2=y2;
		}

		@Override
		public int compareTo(R arg0){
			if(y1-y2+EPS<0){
				return -1;
			}else if(y1-y2>0+EPS){
				return 1;
			}else if(x1-x2+EPS<0){
				return -1;
			}else if(x1-x2>0+EPS){
				return 1;
			}else{
				return 0;
			}
		}
	}

	void debug(Object... os){
		// System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}