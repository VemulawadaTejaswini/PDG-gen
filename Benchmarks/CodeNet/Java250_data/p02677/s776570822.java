import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		// 1周のうちH時間でどれくらい進んだか 
		double h = (double)H / 12.0;
		h += (double)M / 60.0 / 12.0; // 分針
		// 1周のうちM分でどれくらい進んだか
		double m = (double)M / 60.0;
		// 角度
		double rad = Math.PI * 2 * (h - m);
		// System.out.println(rad);
		// 辺の長さ
		double rsq = (A * A) + (B * B) - (2 * A * B * Math.cos(rad));
		System.out.println(Math.sqrt(rsq));
	}
}
