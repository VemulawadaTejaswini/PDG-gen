import java.util.*;

class Point {
	
	double x, y;
	
	// 外積
	double cross(Point p) {
		return x * p.y - y * p.x;
	}
	
	// ベクトル
	Point sub(Point p) {
		Point ret = new Point();
		ret.x = x - p.x;
		ret.y = y - p.y;
		
		return ret;
	}
}


class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while( scan.hasNextDouble() ) {
			Point[] A;
			Point P = new Point();
			
			A = new Point[3];
		
			for(int i = 0; i < 3; i++) {
				A[i] = new Point();
				A[i].x = scan.nextDouble();
				A[i].y = scan.nextDouble();
			}
			
			P.x = scan.nextDouble();
			P.y = scan.nextDouble();
			
			boolean res = true;
			int n = 0;
			
			for(int i = 0; i < 3; i++) {
				double d = P.sub(A[ (i+1)%3 ]).cross((A[ (i+1)%3 ].sub(A[i])));
				int sign;
				if(d < 0) {
					sign = -1;
				} else {
					sign = 1;
				}
				
				if(i == 0) {
					n = sign;
				}
				
				if(n != sign) {
					res = false;
				}
			}
			
			if( res ) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}