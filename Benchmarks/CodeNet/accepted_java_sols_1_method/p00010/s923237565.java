import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0;i < n;i++){
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double A2 = Math.pow((x1-x2),2.0)+Math.pow((y1-y2),2.0); 
			double B2 = Math.pow((x2-x3),2.0)+Math.pow((y2-y3),2.0); 
			double C2 = Math.pow((x3-x1),2.0)+Math.pow((y3-y1),2.0); 
			double A = Math.pow(A2,0.5); 
			double B = Math.pow(B2,0.5);  
			double C = Math.pow(C2,0.5); 
			double sinA = (Math.pow((4*B2*C2)-Math.pow((C2+B2-A2),2.0),0.5))/(2*B*C);
			double R = A/(2*sinA);
			double xen = ((y1-y3)*(Math.pow(y1,2.0)-Math.pow(y2,2.0)+Math.pow(x1,2.0)-Math.pow(x2,2.0))
					-(y1-y2)*(Math.pow(y1,2.0)-Math.pow(y3,2.0)+Math.pow(x1,2.0)-Math.pow(x3,2.0)))/
					(2*(y1-y3)*(x1-x2)-2*(y1-y2)*(x1-x3));
			double yen = ((x1-x3)*(Math.pow(x1,2.0)-Math.pow(x2,2.0)+Math.pow(y1,2.0)-Math.pow(y2,2.0))
					-(x1-x2)*(Math.pow(x1,2.0)-Math.pow(x3,2.0)+Math.pow(y1,2.0)-Math.pow(y3,2.0)))/
					(2*(x1-x3)*(y1-y2)-2*(x1-x2)*(y1-y3));
			System.out.printf("%1.3f %1.3f %1.3f\n",xen,yen,R);
		}
	}
}