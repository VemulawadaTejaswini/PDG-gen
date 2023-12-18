import java.util.*;
public class Main {

	private boolean isRightTri(double a, double b, double c){
		final double EPS = 1.0e-08;
		double sum = Math.pow(a, 2) + Math.pow(b, 2);
		sum = Math.sqrt(sum);
		if(Math.abs(sum - c) < EPS){
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
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			if(a > c){
				double temp = a;
				a = c;
				c = temp;
			}
			if(b > c){
				double temp = b;
				b = c;
				c = temp;
			}
			if(isRightTri(a,b,c))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}