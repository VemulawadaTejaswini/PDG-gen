import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ans = Integer.MAX_VALUE;
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt();
		for(int c = 0; c <= Math.max(X, Y); c++) {
			ans = Math.min(A * Math.max(0, X - c) + B * Math.max(0, Y - c) + 2 * C * c, ans);
		}
		System.out.println(ans);
	}
}