import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int ans = L-max(div(A,C),div(B,D));
		System.out.println(ans);
	}
	static private int div(int a,int b) {
		return a/b+(a%b!=0 ? 1 : 0);
	}
	static private int max(int a, int b) {
		return a > b ? a : b;
	}
}