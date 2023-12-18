import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			double a = sc.nextDouble()*Math.PI/180;
			double b = sc.nextDouble()*Math.PI/180;
			double c = sc.nextDouble()*Math.PI/180;
			double d = sc.nextDouble()*Math.PI/180;
			if(b<0 && d<0) break;
			
			double x1 = Math.cos(a)*Math.cos(b);
			double y1 = Math.cos(a)*Math.sin(b);
			double z1 = Math.sin(a);
			double x2 = Math.cos(c)*Math.cos(d);
			double y2 = Math.cos(c)*Math.sin(d);
			double z2 = Math.sin(c);
			
			double s1 = Math.sqrt(x1*x1+y1*y1+z1*z1);
			double s2 = Math.sqrt(x2*x2+y2*y2+z2*z2);
			double s12 = x1*x2+y1*y2+z1*z2;
			double rad = Math.acos(s12/(s1*s2));
			
			System.out.println((int)(6378.1*rad+0.5));
		}	
	}	
}