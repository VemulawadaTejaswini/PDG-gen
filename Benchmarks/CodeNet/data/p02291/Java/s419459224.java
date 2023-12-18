import java.util.Scanner;

public class Main {
	
	static class Vec{
		int x, y;
		Vec(int x, int y){
			this.x=x;
			this.y=y;
		}
	}
	
	static double value(Vec v) {
		return Math.sqrt(v.x*v.x+v.y*v.y);
	}
	static double scalar(Vec v1, Vec v2) {
		return v1.x*v2.x+v1.y*v2.y;
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			Vec p1=new Vec(x1, y1);
			Vec p2=new Vec(x2, y2);
			Vec a=new Vec(x2-x1, y2-y1);
			int q=sc.nextInt();
			for(int i=0; i<q; i++) {
				int xp=sc.nextInt();
				int yp=sc.nextInt();
				Vec b=new Vec(xp-x1, yp-y1);
				double k=scalar(a, b)/(value(a)*value(a));
				double ansx=k*a.x+p1.x;
				double ansy=k*a.y+p1.y;
				System.out.printf("%.9f %.9f\n", 2*ansx-xp, 2*ansy-yp);
			}

		}
	}
}
