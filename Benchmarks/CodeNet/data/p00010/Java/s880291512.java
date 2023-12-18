import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++){
			String[] s = sc.nextLine().split(" ");
			xyr(s);
		}
		sc.close();
	}
	static void xyr(String[] s){
		double x, y, r;
		double[] xi = new double[3];
		double[] yi = new double[3];
		for(int i = 0; i < 3; i++){
			xi[i] = Double.parseDouble(s[2*i]);
			yi[i] = Double.parseDouble(s[2*i+1]);
		}
		x = xp(xi, yi);
		y = xp(yi, xi);
		r = Math.pow(((xi[1]-x)*(xi[1]-x)+(yi[1]-y)*(yi[1]-y)), 0.5);
		System.out.println(String.format("%.3f %.3f %.3f", x, y, r));
	}
	static double xp(double[] x, double[] y){
		return ((x[1]*x[1]+y[1]*y[1])*(y[0]-y[2])+(x[2]*x[2]+y[2]*y[2])*(y[1]-y[0])+(x[0]*x[0]+y[0]*y[0])*(y[2]-y[1]))/(2*(x[2]*y[1]-x[1]*y[2]+x[0]*y[2]-x[2]*y[0]+x[1]*y[0]-x[0]*y[1]));
	}
}