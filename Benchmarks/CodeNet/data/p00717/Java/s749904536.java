

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		new Main().start();
	}
	Scanner in;
	void start(){
		in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n == 0) return;
			int m = in.nextInt();
			Point[] origins = getChange(m);
			for(int i = 0; i < n; i++){
				int mm = in.nextInt();
				Point[] oresen = getChange(mm);
				Point[] gyakuOresen = new Point[oresen.length];
				for(int j = 0; j < oresen.length;j++){
					gyakuOresen[oresen.length-1-j] = oresen[j];
				}
				if(m == mm){
					if(hikaku(origins, oresen)){
						System.out.println(i+1);
					}else if(hikaku(origins, gyakuOresen)){
						System.out.println(i+1);
					}
				}
			}
			System.out.println("+++++");
		}
	}
	Point[] getChange(int m){
		Point[] points = new Point[m];
		for(int i = 0; i < m; i++){
			int x = in.nextInt();
			int y = in.nextInt();
			points[i] = new Point(x,y);
		}
		Point[] changes = new Point[m-1];
		for(int i = 0; i < points.length-1; i++){
			changes[i] = new Point(points[i+1].x - points[i].x, points[i+1].y - points[i].y);
		}
		return changes;
	}
	boolean hikaku(Point[] o, Point[] c){
		if(o[0].x != 0 && o[0].x == c[0].x){
			for(int i = 1; i < o.length; i++){
				if(!keisan(o[i].x, c[i].x, o[i].y, c[i].y)) return false;
			}
		}else if(o[0].x != 0 && o[0].x == c[0].y){
			for(int i = 1; i < o.length; i++){
				if(!keisan(o[i].x, c[i].y, o[i].y, -c[i].x)) return false;
			}
		}else if(o[0].x != 0 && o[0].x == -c[0].x){
			for(int i = 1; i < o.length; i++){
				if(!keisan(o[i].x, -c[i].x, o[i].y, -c[i].y)) return false;
			}
		}else if(o[0].x != 0 && o[0].x == -c[0].y){
			for(int i = 1; i < o.length; i++){
				if(!keisan(o[i].x, -c[i].y, o[i].y, c[i].x)) return false;
			}
		}else if(o[0].y != 0 && o[0].y == c[0].y){
			for(int i = 1; i < o.length; i++){
				if(!keisan(o[i].y, c[i].y, o[i].x, c[i].x)) return false;
			}
		}else if(o[0].y != 0 && o[0].y == c[0].x){
			for(int i = 1; i < o.length; i++){
				if(!keisan(o[i].y, c[i].x, o[i].x, -c[i].y)) return false;
			}
		}else if(o[0].y != 0 && o[0].y == -c[0].y){
			for(int i = 1; i < o.length; i++){
				if(!keisan(o[i].y, -c[i].y, o[i].x, -c[i].x)) return false;
			}
		}else if(o[0].y != 0 && o[0].y == -c[0].x){
			for(int i = 1; i < o.length; i++){
				if(!keisan(o[i].y, -c[i].x, o[i].x, c[i].y)) return false;
			}
		}else {
			return false;
		}
		return true;
	}
	boolean keisan(int a, int b, int c, int d){
		if((a != 0 && a == b) || (c != 0 && c == d))return true;
		return false;
	}
}

class Point{
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}