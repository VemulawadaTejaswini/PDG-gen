import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		double tt = Integer.MAX_VALUE;
		int h, idx = 0;
		for (int i = 0; i < n; i++) {
			h = sc.nextInt();
			if (Math.abs(a-(double)( t - h * 0.006 ))< tt) {
				tt = Math.abs(a-(double)( t - h * 0.006 ));
				idx = i + 1;
			}
		}
		System.out.println(idx);
	}
}
