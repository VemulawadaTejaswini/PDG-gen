import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong(); // long aを受け取る
		long b = sc.nextLong(); // long bを受け取る
		long c = sc.nextLong(); // long cを受け取る
		long d = sc.nextLong(); // long dを受け取る
		sc.close(); // 標準入力を終了

		long x = b;
		long y = d;

		if (b <= 0 && d <= 0) {
			// 負×負 x=a, y=c が最大
			x = a;
			y = c;
		} else if (a >= 0 && d <= 0) {
			// 正×負 x=a, y=d が最大
			x = a;
		} else if (b <= 0 && c >= 0) {
			// 負×正 x=b, y=c が最大
			y = c;
		} else if (a * c > b * d) {
			// a*cの方が、b*dよりも解が大きい場合 x=a, y=c が最大
			x = a;
			y = c;
		}

		long ans = x * y;

		System.out.println(ans);
	}

}