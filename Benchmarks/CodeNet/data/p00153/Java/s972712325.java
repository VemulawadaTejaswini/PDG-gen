import java.util.Arrays;
import java.util.Scanner;


public class Main {

	Scanner sc;
	
	class Vector{
		public double x, y;
		
		public Vector(double x, double y){
			this.x=x;
			this.y=y;
		}
		
		public double norm(){
			return Math.hypot(x, y);
		}
		
		public double sqrNorm(){
			return x*x+y*y;
		}
		
		public double ip(Vector v){
			return x*v.x+y*v.y;
		}
		
		public Vector add(Vector v){
			return new Vector(x+v.x, y+v.y);
		}
		
		public Vector subtract(Vector v){
			return new Vector(x-v.x, y-v.y);
		}
		
		public Vector multiply(double a){
			return new Vector(x*a, y*a);
		}
		
		public String toString(){
			return String.format("(%5f,%5f)", x, y);
		}
	}
	
	boolean inTriangle(Vector[] v){
		double theta=0;
		for(int i=0;i<3;++i){
			theta+=Math.acos(v[i].ip(v[(i+1)%3])/v[i].norm()/v[(i+1)%3].norm());
		}
		return theta>=Math.PI*2-1e-7;
	}
	
	char solve(Vector[] a, Vector p, double r){
		Vector[] v=new Vector[3], e=new Vector[3];
		r*=r;
		
		boolean isB=true;
		for(int i=0;i<3;++i){
			v[i]=a[i].subtract(p);
			e[i]=a[(i+1)%3].subtract(a[i]);
			isB&=v[i].sqrNorm()<=r;
		}
		if(isB) return 'b';
		
		Vector[] h=new Vector[3];
		boolean isA=true;
		for(int i=0;i<3;++i){
			//点pより三角形の辺と直交するvector
			//hi=vi+(ei・(-vi)/|ei|^2)ei
			h[i]=v[i].subtract(e[i].multiply(e[i].ip(v[i])/e[i].sqrNorm()));
			isA&=h[i].sqrNorm()>=r;
		}
		//debug(h);
		
		if(isA&&inTriangle(v)) return 'a';
		
		boolean isC=false;
		for(int i=0;i<3;++i){
			Vector n=h[i].add(p);
		//	debug(n,n.subtract(a[i]).ip(n.subtract(a[(i+1)%3])));
			if(v[i].sqrNorm()<=r||(n.subtract(a[i]).ip(n.subtract(a[(i+1)%3]))<=0&&h[i].sqrNorm()<=r)){
				isC=true;
			}
		}
		if(isC) return 'c';
		else return 'd';
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		sc=new Scanner(System.in);
		
		while(true){
			int x=ni(),y=ni();
			if(x==0&y==0)break;
			
			Vector[] a=new Vector[3];
			
			for(int i=0;i<3;++i){
				a[i]=new Vector(x, y);
				x=ni(); y=ni();
			}
			Vector p=new Vector(x, y);
			double r=ni();
			
			System.out.println(solve(a,p,r));
		}
	}
	
	void debug(Object...os){
		System.err.println(Arrays.deepToString(os));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}