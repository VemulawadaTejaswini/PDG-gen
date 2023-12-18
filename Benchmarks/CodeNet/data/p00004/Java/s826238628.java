import java.util.*;
public class Main {
	static final Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) {
		while(stdin.hasNext()){
			double a = stdin.nextDouble();
			double b = stdin.nextDouble();
			double c = stdin.nextDouble();
			double d = stdin.nextDouble();
			double e = stdin.nextDouble();
			double f = stdin.nextDouble();
			double x[] = solve(a,b,c,d,e,f);
			System.out.printf("%.3f %.3f\n", x[0], x[1]);
		}
	}
	static final double[] solve(double a, double b, double c, double d, double e, double f){
		double[] ans = new double[2];
		ans[0] = (c*e - b*f) / (a*e - b*d) + 0.0; //+0.0 ???????????¨??´???????????£??????
		ans[1] = (a*f - c*d) / (a*e - b*d) + 0.0; //printf????????¨??? -0.000??¨??????wrong answer????????£????????????
		return ans;
	}
}