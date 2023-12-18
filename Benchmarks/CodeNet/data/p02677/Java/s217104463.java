import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int A = sc.nextInt();
		final int B = sc.nextInt();
		final int H = sc.nextInt();
		final int M = sc.nextInt();
		sc.close();
		double omega_h = 2*Math.PI/12;
		double omega_m = 2*Math.PI/60;
		double dig_h = omega_h*H + M*Math.PI/360;
		double dig_m = omega_m*M;
		double ans = Math.sqrt(A*A + B*B - 2*A*B*Math.cos(Math.abs(dig_h - dig_m)));
		System.out.println(ans);
	}
}
