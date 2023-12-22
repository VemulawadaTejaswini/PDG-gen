import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		sc.close();

		// CとDの最大公約数
		long gcd = gcd(C, D);
		// CとDの最小公倍数
		long lcm = (C * D) / gcd;
		// System.out.println("gcd=" + gcd + " lcm=" + lcm);

		// B以下のCまたはDで割り切れる個数からCとDで割り切れる重複個数を引く
		// B以下の割り切れる個数を求める
		long bCnt = (B / C) + (B / D) - (B / lcm);
		
		// A未満のCまたはDで割り切れる個数からCとDで割り切れる重複個数を引く
		// A未満の割り切れる個数が求められる
		long a = A - 1;
		long aCnt = (a / C) + (a / D) - (a / lcm);
		// System.out.println("bCnt=" + bCnt + " aCnt=" + aCnt);

		// BからB以下の割り切る個数を引く = B以下の割れない個数
		// A未満の割り切れる個数を引く = A未満の割れない個数
		// B以下の割れない個数からA未満の割れない個数を引く
		System.out.println((B - bCnt) - (a - aCnt));
	}

	// 最大公約数
    public static long gcd(long x, long y) {
        // System.out.println("x = " + x + " y = " + y);
        if(y == 0) return x;
        else return gcd(y, x % y);
	}

	// 最小公倍数
    public static long lcm(long x, long y) {
        return (x * y) / gcd(x, y);
    }
}
