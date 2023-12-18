import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	Scanner sc;
	
	class Vector{
		public double x,y;
		
		double norm(){
			return Math.hypot(x,y);
		}
		public Vector(double x,double y){
			this.x=x;
			this.y=y;
		}
	}
	
	Vector sub(Vector a,Vector b){
		return new Vector(a.x-b.x,a.y-b.y);
	}
	
	double op(Vector a,Vector b){
		return a.x*b.y-a.y*b.x;
	}
	double ip(Vector a,Vector b){
		return a.x*b.x+a.y*b.y;
	}
	
	class VectorComparator implements Comparator<Vector>{
		@Override
		public int compare(Vector o1, Vector o2) {
			// TODO Auto-generated method stub
			double sign=o1.y-o2.y;
			if(sign==0)sign=(o1.x-o2.x);
			return (int)Math.signum(sign);
		}
	}
	
	int solve(LinkedList<Vector> coords){
		Collections.sort(coords,new VectorComparator());

		Vector p0=coords.getFirst(),p=p0;
		Vector v=new Vector(1,0);

		do{
			double min=Math.PI*2;
			Vector qmin=null;
			for(Vector q:coords){
				Vector u=sub(q,p);
				double angle=Math.acos(ip(v,u)/(v.norm()*u.norm()));
				if(op(v,u)<0)angle=Math.PI*2-angle;
				if(angle<min){
					min=angle;
					qmin=q;
				}
			}
			v=sub(qmin,p);
			p=qmin;
			coords.remove(p);
		}while(p!=p0);
		return coords.size();
	}
	
	double nd(){
		return sc.nextDouble();
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		sc=new Scanner(System.in).useDelimiter(",|\r\n|\n");
		LinkedList<Vector> coords=new LinkedList<Vector>();
		
		int n;
		while((n=ni())!=0){
			for(int i=0;i<n;++i){
				coords.add(new Vector(nd(),nd()));
			}
			System.out.println(solve(coords));
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}
}