import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // int Nを受け取る
		int D = sc.nextInt(); // int Dを受け取る

		BigDecimal D2 = new BigDecimal(D); // 比較のために変換

		int ans = 0; // 原点との距離がD以下の点の個数

		for (int i = 0; i < N; i++) {
			int X = sc.nextInt(); // int Xを受け取る
			int Y = sc.nextInt(); // int Yを受け取る
			BigDecimal X2 = new BigDecimal(X * X);
			BigDecimal Y2 = new BigDecimal(Y * Y);
			if(D2.compareTo(bigDecimalSqrt(X2 ,Y2)) >= 0) {
				// D2 が 平方根の値以上の時
				ans += 1;
			}
		}
		sc.close(); // 標準入力を終了

		System.out.println(ans);
	}

	// Math.sqrtの誤差対策
	private static BigDecimal bigDecimalSqrt (BigDecimal X, BigDecimal Y) {
		BigDecimal B = X.add(Y);
		//とりあえずdoubleのsqrtを求める
        BigDecimal A = new BigDecimal(Math.sqrt(B.doubleValue()), MathContext.DECIMAL64);
        BigDecimal b2 = new BigDecimal(2);

        for(int tempScale = 16; tempScale < 50; tempScale *= 2){
            //x = x - (x * x - a) / (2 * x);
            A = A.subtract(
                    A.multiply(A).subtract(B).divide(
                    A.multiply(b2), 50, BigDecimal.ROUND_HALF_EVEN));
        }
        return A;
    }

}