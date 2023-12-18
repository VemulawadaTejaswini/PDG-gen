class Point {
	double x,y;
	
	double cross(Point t){
		return x * t.y - t.x * y;
	}
	Point sub(Point t){
		Point ret = new Point();
		ret.x = x-t.x;
		ret.y = y-t.y;
		
		return ret;
	}
}

class Main {

	public static void main( String[] args ){
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while(sc.hasNextDouble()){
			Point A[];
			Point P = new Point();
			
			A = new Point[3];
			
			for(int i = 0; i < 3; ++i){
				A[i] = new Point();
				A[i].x = sc.nextDouble();
				A[i].y = sc.nextDouble();
			}
			P.x = sc.nextDouble();
			P.y = sc.nextDouble();
			
			boolean res = true;
			int initCCW = 0;
			for(int i = 0; i < 3; ++i){
				double d = P.sub(A[ (i+1)%3 ]).cross(A[ (i+1)%3 ].sub(A[i]));
				int sign;
				if( d < 0 ) sign = -1;
				else sign = 1;
				
				if( i == 0 ){
					initCCW = sign;
				}
				if( initCCW != sign ){
					res = false;
				}
			}
			
			
			if( res ){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}