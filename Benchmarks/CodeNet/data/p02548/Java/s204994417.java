import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // int Nを受け取る
		sc.close(); // 標準入力を終了

		int ans = 0; // A*B+C=Nを満たす正整数の組

		// A*B+C=N は A*B=N-C と変形できる
		// N-Cが取りえる値の範囲は、1 <= N-C <= N-1
		// 1 <= A*B <= N-1 を満たす(A,B)の組を探せばよいと分かる
		// つまり、1からN-1までの数の約数の個数の総和を求めればよい
		for(int i = 1; i <= N-1; i++) {
			ans += enum_divisors(i);
		}

		System.out.println(ans);
	}

	// xの約数の個数を求める関数
	public static int enum_divisors(int x) {
		int a = 0;
		// 1からルートxまで、割り切れるか試す
		for (int i = 1; i * i <= x; i++) {
			if(x % i == 0) {
				a += 1;
				// 重複しないならば i の相方である N/i も 個数に数える
	            if (x/i != i) a += 1;
			}
		}
		return a;
	}

}