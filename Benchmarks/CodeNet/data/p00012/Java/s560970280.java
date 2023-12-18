import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		while(scan.hasNext()){
			double[] x = new double[3];
			double[] y = new double[3];
			for(int i = 0; i < 3; i++){
				x[i] = scan.nextDouble();
				y[i] = scan.nextdouble();
			}

			double xp = scan.nextDouble();
			double yp = scan.nextDouble();

			for(int i = 0; i < 3; i++){
				x[i] = x[i] - xp;
				y[i] = y[i] - yp;
			}

			double[] gaiseki = new double[3];
			gaiseki[0] = x[0]*y[1] - y[0]*x[1];
			gaiseki[1] = x[1]*y[2] - y[2]*x[1];
			gaiseki[2] = x[2]*y[0] - y[2]*x[0];

			int plus = 0;
			int minus = 0;
			for(int i = 0; i < 3; i++){
				if(gaiseki[i] > 0)plus++;
				if(gaiseki[i] < 0)minus++;
			}

			String ans = "NO";
			if(plus == 3 || minus == 3)ans = "YES";
			System.out.printf("%s\n", ans);
		}
	}
}