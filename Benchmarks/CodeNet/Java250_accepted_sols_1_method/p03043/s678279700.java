import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int count = 0;
		double ans = 0;
		for (int i = 1; i <= n; i++) {
			int j = 0;
			count = i;
			for(;count<k;j++) {
				count *=2;
			}
			ans += 1.0 / (n * Math.pow(2,j));
		}
		System.out.println(ans);
		scn.close();
	}
}