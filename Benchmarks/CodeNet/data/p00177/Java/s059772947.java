import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		for(;;){
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			if((a==-1)&&(b==-1)&&(c==-1)&&(d==-1)){
				break;
			}
			
			double vz = Math.sin(Math.toRadians(a));
			double vx = Math.cos(Math.toRadians(a))*Math.cos(Math.toRadians(b));
			double vy = Math.cos(Math.toRadians(a))*Math.sin(Math.toRadians(b));

			double wz = Math.sin(Math.toRadians(c));
			double wx = Math.cos(Math.toRadians(c))*Math.cos(Math.toRadians(d));
			double wy = Math.cos(Math.toRadians(c))*Math.sin(Math.toRadians(d));

			double dot = vz*wz + vx*wx + vy * wy;
			double theta = Math.acos(dot);
			double R =6378.1;
			System.out.println((int)(R*theta+0.5));
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}