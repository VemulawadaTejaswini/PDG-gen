import java.util.*;
public class Main {

	private boolean isParallel(double ax, double ay, double bx, double by){
		final double EPS = 1.0e-8;
		double result = ax * bx - ay * by;
		if(Math.abs(result) < EPS){
			return true;
		}
		else{
			return false;
		}
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i < n; i++){
			double [] x = new double[4];
			double [] y = new double[4];
			for(int j=0; j < 4; j++){
				x[j] = sc.nextDouble();
				y[j] = sc.nextDouble();
			}

			double ax = x[1] - x[0];
			double ay = y[1] - y[0];
			double bx = x[3] - x[2];
			double by = y[3] - y[2];

			if(isParallel(ax, ay, bx, by)){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}