import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static long K = Long.parseLong(sc.next());
	static long A = Long.parseLong(sc.next());
	static long B = Long.parseLong(sc.next());
	public static void main(String[] args) {
		if (B-A <= 2 || K-A <= 0) {
			System.out.println(K+1);
			return;
		}
//		long trade = (K+1)/(A+2);
		// 一度Aまでビスケットを増やしてしまえば何回でも叩ける
		long trade = (K+1 - A) / 2;
//		System.out.println(trade);
//		System.out.println(B-A-2);
		long ans = trade * (B-A-2) + K + 1;
		System.out.println(ans);
	}
}
