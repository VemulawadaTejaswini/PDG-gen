import java.util.Scanner;

public class Main {
	static int[]bit;
	static int A, B, C, D;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		A = s.charAt(0) - '0';
		B = s.charAt(1) - '0';
		C = s.charAt(2) - '0';
		D = s.charAt(3) - '0';
		bit = new int[3];
		rec(0);
	}
	static void rec(int k) {
		if(k == bit.length) {
			solve();
			return;
		}
		rec(k + 1);
		bit[k] = 1;
		rec(k + 1);
		bit[k] = 0;
	}
	static void solve() {
		int t = 0;
		if(bit[0] == 0) {
			t += A + B;
		}else {
			t += A - B;
		}
		if(bit[1] == 0) {
			t += C;
		}else {
			t -= C;
		}
		if(bit[2] == 0) {
			t += D;
		}else {
			t -= D;
		}
		if(t == 7) {
			String[]op = {"+", "-"};
			System.out.println(A + op[bit[0]] + B + op[bit[1]] + C + op[bit[2]] + D +"=7");
			System.exit(0);
		}
	}
}