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
	int m;
	Seg[] segs;

	void run(){
		m=8;
		for(;;){
			n=sc.nextInt();
			if(n<0){
				break;
			}
			segs=new Seg[n];
			for(int i=0; i<n; i++){
				char c=sc.next().charAt(0);
				int x=sc.nextInt();
				int y=sc.nextInt();
				if(c=='x'){
					segs[i]=new Seg(0, x, y, x+1, y);
				}else{
					segs[i]=new Seg(1, x, y, x, y+1);
				}
			}
			solve();
		}
	}

	void solve(){
		// Å(0.75, 0.25)->(1, 0.5);
		P p0=new P(0.75, 0.25);
		P p=new P(0.75, 0.25);
		P v=new P(1, 1);
		Seg[] walls=new Seg[4];
		walls[0]=new Seg(0, 0, 0, m, 0);
		walls[1]=new Seg(0, 0, m, m, m);
		walls[2]=new Seg(0, 0, 0, 0, m);
		walls[3]=new Seg(0, m, 0, m, m);
		for(int i=0; i<10; i++){
			v=v.div(v.abs()).mul(2*m);

			debug("p", p.x, p.y);
			debug("v", v.x, v.y);

			if(p.sub(p0).abs()>EPS&&disSP(p, p.add(v), p0)<EPS){
				debug("l", p0.x, p0.y);
				int x=(int)(p0.x*100+EPS);
				int y=(int)(p0.y*100+EPS);
				println(x+" "+y);
				break;
				// I¹
			}

			Seg seg=null;
			P p2=null;
			double min=INF;
			for(Seg s : segs){
				if(crsSS(p, p.add(v), s.p1, s.p2)){
					P q=isLL(p, p.add(v), s.p1, s.p2);
					double d=p.sub(q).abs();
					if(d<min+EPS&&d>EPS){
						seg=s;
						p2=q;
						min=p.sub(q).abs();
					}
				}
			}

			if(p2!=null){
				// debug("p2", p2.x, p2.y);
				p=p2;
				if(seg.d==0){
					// xûü
					v.y=-v.y;
				}else{
					v.x=-v.x;
				}
				// debug("v2", v.x, v.y);
			}else{
				for(Seg s : walls){
					if(crsSS(p, p.add(v), s.p1, s.p2)){
						P q=isLL(p, p.add(v), s.p1, s.p2);
						if(p.sub(q).abs()>EPS){
							debug("Ç", q.x, q.y);
							int x=(int)(q.x*100+EPS);
							int y=(int)(q.y*100+EPS);
							println(x+" "+y);
						}
					}
				}
				break;
			}

			// vðâ³
			// (p->p+v)ªp0ÉÕËµÄ¢éêsyuuryou
			// else
			// ¾ÆÌð_ðT·
			//  éê»Ìð_ðq
			// p=q
			// vÍxÈç -v.x,
			// yÈç-v.y
		}
	}

	// üªÆ_Ì£
	double disSP(P p1, P p2, P q){
		if(p2.sub(p1).dot(q.sub(p1))<EPS)
			return q.sub(p1).abs();
		if(p1.sub(p2).dot(q.sub(p2))<EPS)
			return q.sub(p2).abs();
		return disLP(p1, p2, q);
	}

	// ¼üÆ_Ì£
	double disLP(P p1, P p2, P q){
		return abs(p2.sub(p1).det(q.sub(p1)))/p2.sub(p1).abs();
	}

	// üªÆüªÌð·»è
	boolean crsSS(P p1, P p2, P q1, P q2){
		if(max(p1.x, p2.x)+EPS<min(q1.x, q2.x))
			return false;
		if(max(q1.x, q2.x)+EPS<min(p1.x, p2.x))
			return false;
		if(max(p1.y, p2.y)+EPS<min(q1.y, q2.y))
			return false;
		if(max(q1.y, q2.y)+EPS<min(p1.y, p2.y))
			return false;
		return signum(p2.sub(p1).det(q1.sub(p1)))
				*signum(p2.sub(p1).det(q2.sub(p1)))<EPS
				&&signum(q2.sub(q1).det(p1.sub(q1)))
						*signum(q2.sub(q1).det(p2.sub(q1)))<EPS;
	}

	// ¼üÆ¼üÌð_
	P isLL(P p1, P p2, P q1, P q2){
		double d=q2.sub(q1).det(p2.sub(p1));
		if(abs(d)<EPS)
			return null;
		return p1.add(p2.sub(p1).mul(q2.sub(q1).det(q1.sub(p1))/d));
	}

	class Seg{
		int d;
		P p1, p2;

		Seg(int d, int x1, int y1, int x2, int y2){
			this.d=d;
			p1=new P(x1, y1);
			p2=new P(x2, y2);
		}
	}

	// 2 dimensions
	class P{
		double x, y;

		P(){
			this(0, 0);
		}

		P(double x, double y){
			this.x=x;
			this.y=y;
		}

		P add(P p){
			return new P(x+p.x, y+p.y);
		}

		P sub(P p){
			return new P(x-p.x, y-p.y);
		}

		P mul(double m){
			return new P(x*m, y*m);
		}

		P div(double d){
			return new P(x/d, y/d);
		}

		double abs(){
			return Math.sqrt(abs2());
		}

		double abs2(){
			return x*x+y*y;
		}

		double arg(){
			return Math.atan2(y, x);
		}

		// inner product
		double dot(P p){
			return x*p.x+y*p.y;
		}

		// outer product
		double det(P p){
			return x*p.y-y*p.x;
		}

		P rot90(){
			return new P(-y, x);
		}

		// conjugation
		P conj(){
			return new P(x, -y);
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