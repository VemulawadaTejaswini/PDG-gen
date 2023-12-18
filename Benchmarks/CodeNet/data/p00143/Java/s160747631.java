import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	final double EPS=1e-6;
	Scanner sc;
	
	class Vector{
		double x,y;
		double norm(){
			return Math.hypot(x, y);
		}
		Vector(double x,double y){
			this.x=x;
			this.y=y;
		}
	}
	
	Vector sub(Vector a,Vector b){
		return new Vector(a.x-b.x,a.y-b.y);
	}
	
	double ip(Vector a,Vector b){
		return a.x*b.x+a.y*b.y;
	}
	
	double theta(Vector a,Vector b,Vector c){
		Vector v=sub(a,b),u=sub(c,b);
		return Math.acos(ip(v,u)/v.norm()/u.norm());
	}

	boolean inTriangle(Vector[] triangle,Vector p){
		double angle=0;
		for(int i=0;i<3;++i){
			angle+=theta(triangle[i],p,triangle[(i+1)%3]);
		}
		return Math.abs(angle-Math.PI*2)<EPS;
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		sc=new Scanner(System.in);
		int n=ni();
		
		for(int a=0;a<n;++a){
			Vector[] triangle=new Vector[3];
			for(int i=0;i<3;++i){
				triangle[i]=new Vector(ni(),ni());
			}
			Vector k=new Vector(ni(),ni()),s=new Vector(ni(),ni());
			System.out.println(inTriangle(triangle,k)^inTriangle(triangle,s)?"OK":"NG");
		}
		sc.close();
	}
	
	void debug(Object...os){
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}