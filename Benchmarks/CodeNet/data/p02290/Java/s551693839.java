
import java.util.*;
import java.math.BigDecimal;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		double x1 = stdIn.nextDouble();
		double y1 = stdIn.nextDouble();
		double x2 = stdIn.nextDouble();
		double y2 = stdIn.nextDouble();
		int q = stdIn.nextInt();
		for(int i=0;i<q;i++){
			double xp = stdIn.nextDouble();
			double yp = stdIn.nextDouble();
			Vector vec1 = new Vector(x1,y1,x2,y2);
			Vector vec2 = new Vector(x1,y1,xp,yp);
			vec1.projection(vec2);
			System.out.println((vec1.x+x1)+" "+(vec1.y+y1));
		}

	}	
}

class Vector{
	public final double EPS = Math.pow(10,-8);
	public double x,y;
	int cutoff = 9;

	Vector( double x1 , double y1 , double x2 , double y2 ){
		this.x = x2 - x1;
		this.y = y2 - y1;
	}

	double dot( Vector a ){	
		return cuttingOff(this.x * a.x + this.y * a.y);
	}
	double cross( Vector a ){	
		return cuttingOff(this.x * a.y - this.y * a.x);
	}

	void add( Vector a ){
		this.x = cuttingOff(this.x + a.x);
		this.y = cuttingOff(this.y + a.y);
	}
	void sub( Vector a ){
		this.x = cuttingOff(this.x - a.x);
		this.y = cuttingOff(this.y - a.y);
	}
	void mul( double z ){
		this.x = cuttingOff(this.x * z);
		this.y = cuttingOff(this.y * z);
	}
	void div( double z ){
		this.x = cuttingOff(this.x / z);
		this.y = cuttingOff(this.y / z);
	}

	double abs(){
		return Math.sqrt(norm());
	}
	double norm(){
		return cuttingOff(this.x * this.x + this.y * this.y);
	}

	void projection( Vector a ){
		if(judge(a.norm())){
			this.x = 0;
			this.y = 0;
		}
		else{
			double cos = dot(a)/(abs() * a.abs());
			double frac = a.abs() * cos/abs();
			mul(frac);
		}
	}
	Vector reflection( Vector a ){
		projection(a);
		return new Vector(a.x,a.y,this.x,this.y);
	}

	boolean judgeisOrthogonal( Vector a ){	
		return judge(dot(a)) ? true : false;
	}  
	boolean judgeisParallel( Vector a ){	
		return judge(cross(a)) ? true : false;
	}

	boolean judge( double a ){		
		return Math.abs(a)<EPS ? true : false;
	}
	double cuttingOff(double a){
		BigDecimal bi = new BigDecimal(String.valueOf(a));
		return bi.setScale(cutoff,BigDecimal.ROUND_DOWN).doubleValue();
	}
} 