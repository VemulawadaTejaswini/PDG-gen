import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		double p = h*30 + m*0.5;
		double q = m*6;
		
		double ans = 0;
		double th = Math.abs(p-q);
		double th1 = 360 - Math.abs((p-q));
		if(th<th1) {
			ans = th;
		}else {
			ans = th1;
		}
		double result = Math.cos(Math.toRadians(ans));
		double line = Math.pow(a,2) + Math.pow(b, 2) - 2*a*b*result;
		double x = Math.sqrt(line);
		System.out.println(x);
	}

}
