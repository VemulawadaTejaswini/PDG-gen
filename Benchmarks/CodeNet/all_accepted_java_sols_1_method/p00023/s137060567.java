import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double xa[] = new double[n];
		double ya[] = new double[n];
		double ra[] = new double[n];
		double xb[] = new double[n];
		double yb[] = new double[n];
		double rb[] = new double[n];

		for (int i = 0; i < n; i++) {
			xa[i] = sc.nextDouble();
			ya[i] = sc.nextDouble();
			ra[i] = sc.nextDouble();
			xb[i] = sc.nextDouble();
			yb[i] = sc.nextDouble();
			rb[i] = sc.nextDouble();
		}

		double dx, dy, dr, xly;

		for (int i = 0; i < n; i++) {
			dx = Math.abs(xa[i] - xb[i]);
			dy = Math.abs(ya[i] - yb[i]);
			dr = Math.abs(ra[i] - rb[i]);
			xly = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
			if (ra[i] > xly + rb[i]) {
				System.out.println(2);
			} else if(rb[i] > xly + ra[i]) {
				System.out.println(-2);
			} else if(ra[i] + rb[i] >= xly){
				System.out.println(1);
			} else if(ra[i] + rb[i] < xly){
				System.out.println(0);
			}
		}
	}
}