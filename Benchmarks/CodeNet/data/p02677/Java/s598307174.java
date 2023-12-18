import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double m = sc.nextDouble();
		double ans = 0;
        double H = Math.toRadians(90-30*h-m/2);
        double M = Math.toRadians(90-6*m);
        double x1 = a*Math.cos(H);
        double y1 = a*Math.sin(H);
        double x2 = b*Math.cos(M);
        double y2 = b*Math.sin(M);
        ans = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		System.out.println(ans);
	}
}