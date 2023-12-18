import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) return;
			long m = sc.nextLong();
			int[][] d = new int[n][2];
			
			for(int i=0; i<n; i++) {
				d[i][0] = sc.nextInt();
				d[i][1] = sc.nextInt();
			}
			
			Arrays.sort(d ,(a,b)-> Integer.compare(b[1],a[1]));
			int ans = 0;
			for(int i=0; i<n; i++) {
				if(d[i][0] <= m) {
					m -= d[i][0];
				}else {
					ans += (d[i][0] - m) * d[i][1];
					m = 0;
				}
			}
			System.out.println(ans);
		}
	}

}

