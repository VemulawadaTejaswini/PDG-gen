import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int t=1;;t++) {
			int n = sc.nextInt();
			if(n == 0) break;
			double[] x = new double[n], y = new double[n];
			for(int i=0;i<n;i++) {
				x[i] = sc.nextDouble(); y[i] = sc.nextDouble();
			}
			double area = 0;
			for(int i=0;i<n;i++) area += (x[i]-x[(i+1)%n]) * (y[i]+y[(i+1)%n]);
			System.out.println(t + " " + Math.abs( area / 2 ) );
		}
	}
}