import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		double angleH = 0;
		double angleM = 0;
		angleH = H * 30 + M * 0.5;
		angleM = M * 6;
		double angle = angleH - angleM;
		double ans = Math.sqrt(Math.pow(A,2) + Math.pow(B,2) - 2 * A * B * Math.cos(Math.toRadians(angle)));
		System.out.print(ans);
	}
}