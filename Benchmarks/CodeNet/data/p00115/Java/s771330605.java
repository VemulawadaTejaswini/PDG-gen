class Point{
	double x,y,z;
	
	Point(double x, double y, double z)
	{
		this.x = x; this.y = y; this.z = z;
	}
	
	Point cross(Point t){
		return new Point(y*t.z-z*t.y, z*t.x-x*t.z, x*t.y-y*t.x);
	}
	
	Point to(Point t){
		return new Point(t.x-x,t.y-y,t.z-z);
	}
	
	Point from(Point t){
		return new Point(t.x+x,t.y+y,t.z+z);
	}
	
	double dot(Point t){
		return x*t.x + y*t.y + z*t.z;
	}
	
	Point unit(){
		double len = Math.sqrt(x*x+y*y+z*z);
		return new Point(this.x / len, this.y / len, this.z / len);
	}
	
	Point extend(double mag)
	{
		return new Point(this.x * mag, this.y * mag, this.z * mag);
	}
	
	public String toString(){
		String ret = "("+x+" "+y+" "+z+")";
		return ret;
	}
}

class Main {
	public static void main(String [] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		Point advance = new Point(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		Point enemy = new Point(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		Point[] tri = new Point[3];
		for(int i = 0; i < tri.length; ++i){
			tri[i]=new Point(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		}
		
		Point a = tri[0].to(tri[1]);
		Point b = tri[0].to(tri[2]);
		
		Point f = a.cross(b).unit();
		
		boolean miss = true;
		double n1 = f.dot(enemy.to(tri[0]));
		double n2 = f.dot(advance.to(tri[0]));
		
		if( n1 * n2 <= 0 ){
			Point cp = f.extend(n1).from(enemy);
			
			// System.out.println(cp);

			int sign = 0;
			for(int i = 0; i < 3; ++i){
				Point t1 = tri[i].to(tri[ (i+1) % 3 ]);
				
				double cc = t1.cross(tri[i].to(cp)).dot(f);
				// System.out.println(cc +  " " + sign);
				if( equals( cc, 0 ) ) {
					// System.out.println("A");
					continue;
				}else if( sign == 0 ) {
					// System.out.println("B");
					if( cc < 0 ) {
						sign = -1;
					}else {
						sign = 1;
					}
				}else{
					// System.out.println("C");
					if( cc * sign < 0 ) miss = false;
				}
			}
		}else{
			miss = false;
		}
		
		if( miss ) {
			System.out.println("MISS");
		}else{
			System.out.println("HIT");
		}
	}
	
	static boolean equals(double a, double b){
		return Math.abs(b-a)<0.00000001;
	}
}