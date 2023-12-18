import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 座標の個数
		long D = sc.nextLong(); // 原点からの距離がD以下
		D *= D;
		int count = 0; // 条件に合う座標の個数
		System.out.println(N + "," + D);

		for(int i = 0; i < N; i++) {
			long x = sc.nextInt();
			long y = sc.nextInt();
			long d = x * x + y * y;
			if(d <= D) {
				count++;
			}
		}
		System.out.println(count);
	}
}
