
import java.util.*;
import java.math.BigDecimal;

class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		Point[] query = new Point[n];
		for(int i=0;i<n;i++){
			double x = stdIn.nextDouble();
			double y = stdIn.nextDouble();
			query[i] = new Point(x,y);
		}
		int q = stdIn.nextInt();
		for(int i=0;i<q;i++){
			double x = stdIn.nextDouble();
			double y = stdIn.nextDouble();
			Point z = new Point(x,y);
			System.out.println(z.contains(query));
		}
	}	
}

class Point{

	public double x,y;
	final double EPS = Math.pow(10,-8);

	Point(double x,double y){
		this.x = x;
		this.y = y;
	}

	double abs(){
		Point a = new Point(0,0);	
		return Math.sqrt(norm(a));	
	}
	double abs( Point a ){
		return Math.sqrt(norm(a));
	}
	double norm( Point a ){	
		return (this.x - a.x) * (this.x - a.x) + (this.y - a.y) * (this.y - a.y);
	}

	void add( Point a ){
		this.x += a.x;
		this.y += a.y;
	}
	void sub( Point a ){
		this.x -= a.x;
		this.y -= a.y;
	}
	void mul( double z){
		this.x *= z;
		this.y *= z;
	}
	void div( double z){
		this.x /= z;
		this.y /= z;
	}

	Point getCrossPoint( Point a , Point b , Point c ){
		Point d = new Point(this.x,this.y);
		Vector s1 = new Vector(d.x,d.y,a.x,a.y);
		Vector s2 = new Vector(b.x,b.y,c.x,c.y);
		double t1 = getDistanceSP(b,c);
		double t2 = a.getDistanceSP(b,c);
		s1.mul(t1/(t1+t2));
		Vector s3 = new Vector(b.x,b.y,d.x,d.y);
		s3.add(s1);
		return new Point(b.x+s3.x,b.y+s3.y);
	}

	double getDistance( Point a , Point b , Point c ){
		if(intersect(a,b,c)){
			return 0.0;
		}
		return Math.min(getDistanceSP(b,c),a.getDistanceSP(b,c));
	}
	double getDistanceSP( Point a , Point b ){
		Vector s = new Vector( a.x , a.y , b.x , b.y);
		Vector sa = new Vector( a.x , a.y , this.x , this.y );
		Vector sb = new Vector( b.x , b.y , this.x , this.y );
		if(s.dot(sa)<0.00){
			return abs(a);
		}
		s.mul(-1);
		if(s.dot(sb)<0.00){
			return abs(b);
		}
		return Math.abs(s.cross(sb)/s.abs());
	}

	int CCW( Point a , Point b ){
		Vector sa = new Vector( this.x , this.y , a.x , a.y );
		Vector sb = new Vector( this.x , this.y , b.x , b.y );
		if(sa.cross(sb) > EPS){
			return -1;
		}
		else if(sa.cross(sb) < -EPS){
			return 1;
		}
		else if(sa.dot(sb) < -EPS){
			return -2;
		}
		else if(sa.norm() < sb.norm()){
			return 2;
		}
		else{
			return 0;
		}
	}
	boolean intersect( Point a , Point b , Point c ){
		Point d = new Point(this.x,this.y);
		if(CCW(a,b)*CCW(a,c) <= 0 && b.CCW(c,a)*b.CCW(c,d) <= 0){
			return true;
		}
		else{
			return false;
		}
	}

	int contains( Point[] query ){
		boolean flag1 = false;
		Point p = new Point(this.x,this.y);
		final int l = query.length;
		for(int i=0;i<query.length;i++){
			if(judge(query[i]) || query[i].CCW(query[(i+1)%l],p) == 0){
				flag1 = true;
			}
		}
		boolean flag2 = false;
		for(int i=0;i<query.length;i++){
			Vector v1 = new Vector(this.x,this.y,query[i].x,query[i].y);
			Vector v2 = new Vector(this.x,this.y,query[(i+1)%query.length].x,query[(i+1)%query.length].y);
			if(v1.y<=0 && v2.y>0 && v1.cross(v2)<0){
				flag2 = !flag2;
			}
			else if(v2.y<=0 && v1.y>0 && v2.cross(v1)<0){
				flag2 = !flag2;
			}
		}
		if(flag1){
			return 1;
		}
		else if(flag2){
			return 2;
		}
		return 0;
	}

	void temp( Point a ){
		Point temp = new Point(0,0);
		temp.x = this.x;
		temp.y = this.y;
		this.x = a.x;
		this.y = a.y;
		a.x = temp.x;
		a.y = temp.y;
	}
	void sort( Point[] query){
		for(int i=0;i<query.length;i++){
			for(int j=0;j<query.length-1-i;j++){
				if(query[j].x > query[j+1].x){
					query[j].temp(query[j+1]);
				}
				else if(query[j].x == query[j+1].x && query[j].y > query[j+1].y){
					query[j].temp(query[j+1]);
				}
			}
		}
	}

	Point polarCos(double cos_a){
		double sin_a = Math.sqrt(1-Math.pow(cos_a,2));
		double x = cos_a*this.x - sin_a*this.y;
		double y = sin_a*this.x + cos_a*this.y;
		return new Point(x,y); 
	}
	Point polarSin(double sin_a){
		double cos_a = Math.sqrt(1-Math.pow(sin_a,2));
		double x = cos_a*this.x - sin_a*this.y;
		double y = sin_a*this.x + cos_a*this.y;
		return new Point(x,y); 
	}

	boolean judge( Point a ){	
		if( Math.abs( this.x - a.x ) < EPS && Math.abs( this.y - a.y ) < EPS){
			return true;
		}
		else{
			return false;
		}
	}
}

class Vector{
	public final double EPS = Math.pow(10,-8);
	public double x,y;

	Vector( double x1 , double y1 , double x2 , double y2 ){
		this.x = x2 - x1;
		this.y = y2 - y1;
	}

	double dot( Vector a ){	
		return this.x * a.x + this.y * a.y;
	}
	double cross( Vector a ){	
		return this.x * a.y - this.y * a.x;
	}

	void add( Vector a ){
		this.x += a.x;
		this.y += a.y;
	}
	void sub( Vector a ){
		this.x -= a.x;
		this.y -= a.y;
	}
	void mul( double z ){
		this.x *= z;
		this.y *= z;
	}
	void div( double z ){
		this.x /= z;
		this.y /= z;
	}

	double abs(){
		return Math.sqrt(norm());
	}
	double norm(){
		return this.x * this.x + this.y * this.y;
	}

	double cos(Vector a){
		Vector b = new Vector(0,0,this.x,this.y);
		Vector c = new Vector(a.x,a.y,b.x,b.y);
		if(judge(a.dot(b))){
			return 0.0;
		}
		double cos = (Math.pow(a.abs(),2)+Math.pow(b.abs(),2)-Math.pow(c.abs(),2))/(2*a.abs()*b.abs());
		return cos;
	}
	double sin(Vector a){
		Vector b = new Vector(0,0,this.x,this.y);
		if(judge(a.cross(b))){
			return 0.0;
		}
		double height = a.cross(b)/a.abs();
		double sin = b.abs()/height;
		return sin;
	}
	double cosLength( double a , double b , double c ){
		double cos = (Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,2))/(2 * a * b);
		if(judge(cos)){
			return 0.0;
		}
		return cos;
	}
	double sinLength( double a , double b , double c ){
		double cos = cosLength(a,b,c);
		if(judge(1-cos)){
			return 0.0;
		}
		return Math.sqrt(1-Math.pow(cos,2));

	}

	void projection( Vector a ){
		double cos = dot(a)/(abs() * a.abs());
		double frac = a.abs() * cos/abs();
		mul(frac);
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
} 