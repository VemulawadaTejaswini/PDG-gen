import java.util.Scanner;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();

		int x3=0;
		int y3=0;
		int x4=0;
		int y4=0;
		if(x1 == x2){
			if(y1 > y2){
				x3 = x2 + (y1 - y2);
				y3 = y2;
				x4 = x3;
				y4 = y3 + (y1 - y2);
			}else{
				x3 = x2 - (y2 - y1);
				y3 = y2;
				x4 = x3;
				y4 = y3 - (y2 - y1);
			}
		}else if(y1 == y2){
			if(x1 > x2){
				x3 = x2;
				y3 = y2 - (x1 - x2);
				x4 = x3 + (x1 - x2);
				y4 = y3;
			}else{
				x3 = x2;
				y3 = y2 + (x2 - x1);
				x4 = x3 - (x2 - x1);
				y4 = y3;
			}
		}else{
			int dx,dy;
			if(x1 < x2 & y1 < y2){
				dx = x2 - x1;
				dy = y2 - y1;
				x3 = x2 - dy;
				y3 = y2 + dx;
				x4 = x3 - dx;
				y4 = y3 - dy;
			}
			if(x1 > x2 & y1 < y2){
				dx = x1 - x2;
				dy = y2 - y1;
				x3 = x2 - dy;
				y3 = y2 - dx;
				x4 = x3 + dx;
				y4 = y3 - dy;
			}
			if(x1 > x2 & y1 > y2){
				dx = x1 - x2;
				dy = y1 - y2;
				x3 = x2 + dy;
				y3 = y2 - dx;
				x4 = x3 + dx;
				y4 = y3 + dy;
			}
			if(x1 < x2 & y1 > y2){
				dx = x2 - x1;
				dy = y1 - y2;
				x3 = x2 + dy;
				y3 = y2 + dx;
				x4 = x3 - dx;
				y4 = y3 + dy;
			}
		}

		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
	}

}