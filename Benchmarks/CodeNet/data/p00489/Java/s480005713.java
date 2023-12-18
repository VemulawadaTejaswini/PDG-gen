import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n >= 2 && n <= 100) {
			int[] score = new int[n+1];
			int a, b, c, d; // team a, team b, score a, score b;
			for(int i=0; i<n*(n-1)/2; i++) {
				a = sc.nextInt();
				b = sc.nextInt();
				c = sc.nextInt();
				d = sc.nextInt();
				if(c > d) {
					score[a] += 3;
				} else if(c < d) {
					score[b] += 3;
				} else {
					score[a]++;
					score[b]++;
				}
			}
			
			/* ソートした配列を別に用意、
			 * 順に比較して一致したものにランクづけ
			*/
			int[] sort = new int[n];
			int[] rank = new int[n+1];
			
			for(int i=1; i<=n; i++) {
				sort[i-1] = score[i];
			}
			Arrays.sort(sort);
			int x = 1; // 順位をあらわす
			int cnt;
			
			for(int i=n-1; i>=0;) {
				cnt = 0; // 増分値指定の変数
				for(int j=1; j<=n; j++) {
					if(sort[i] == score[j]) {
						rank[j] = x;
						cnt++;
					}
				}
				x += cnt; // 次の順位を導く
				i -= cnt; // 重複しないよう、同じ内容の要素をスキップ
			}

			for(int i=1; i<rank.length; i++) {
				System.out.println(rank[i]);
			}
		}
	}
}