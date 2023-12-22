import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();

		// Aの回った角度
		double turnA = ((H * 60) + M) * 0.5;
		// Bの回った角度
		double turnB = M * 6.0;
		// AとBの角度差
		double d = Math.abs(turnA - turnB);

		// 余弦定理で解く
		double X = Math.pow(A, 2) + Math.pow(B, 2) - (2 * A * B * Math.cos(Math.toRadians(d)));
		X = Math.sqrt(X);
		System.out.println(X);
	}
}
