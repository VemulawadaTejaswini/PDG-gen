import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double A = sc.nextDouble();
		Double B = sc.nextDouble();
		Double H = sc.nextDouble();
		Double M = sc.nextDouble();
		Double kaku = 0.0;
		kaku=Math.min(Math.abs((30*H+0.5*M)-6*M), (6*M-(30*H+0.5*M)));
		double kekka=0;
		
		kekka=(Math.pow(A, 2)+Math.pow(B, 2)-(2*A*B)*Math.cos(Math.toRadians(kaku)));
		kekka=Math.sqrt(kekka);
		
		System.out.print(kekka);
		sc.close();
	}
}
