import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int maxL = 0;
		int minR = 100_009;
		
		for (int i = 0; i < m; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			maxL = Math.max(maxL, l);
			minR = Math.min(minR, r);
		}
		
		int dif = minR - maxL;
		int ans = Math.max(dif + 1, 0);
		
		System.out.println(ans);
		

	}
}
