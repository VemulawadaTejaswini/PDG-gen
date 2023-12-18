
import java.util.*;

class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();
		double B = sc.nextInt();
		double H = sc.nextInt();
		double M = sc.nextInt();
		
		double radH = 2*Math.PI*(H/12 + M/60/12);
		double radM = 2*Math.PI* M/60;
		double x1 = (double)A*Math.cos(radH), y1 = A*Math.sin(radH);
		double x2 = (double)B*Math.cos(radM), y2 = B*Math.sin(radM);
		double dx = x1 - x2, dy = y1- y2;
		double ansans = Math.pow(dx, 2) + Math.pow(dy,2);
		double ans = Math.sqrt(ansans);
		System.out.print(ans);
		
	}

}


