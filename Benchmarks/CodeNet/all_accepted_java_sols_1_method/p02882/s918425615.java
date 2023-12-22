import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double x = sc.nextDouble();
		double h = (2*x)/(b*a);
		double theta = 0;
		if(h < a) { //near empty
			theta = Math.atan((b/h));
		} else {//not near empty
			h = (2*x)/(a*a)-b;
			theta = Math.atan((b-h)/a);
		}
		theta = Math.toDegrees(theta);
		System.out.println(theta);

	}

}
