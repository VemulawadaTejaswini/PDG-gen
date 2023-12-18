import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n, i, rankcnt = 0;
		n = sc.nextInt();
		int[] point = new int[n+1];
		int[] rank = new int[n+1];
		for(i = 0; i < n*(n-1)/2; i++) {
			int teamA = sc.nextInt();
			int teamB = sc.nextInt();
			int pointA = sc.nextInt();
			int pointB = sc.nextInt();
			if(pointA > pointB) point[teamA] += 3;
			else if(pointA == pointB) {
				point[teamA] += 1;
				point[teamB] += 1;
			} 
			else point[teamB] += 3;
		}
		for(i = 1; i <= n; i ++) rank[i] = 1;
		for(i = 1; i <= n; i++) {
			for(int j  = 1; j <= n; j++) {
				if(point[i] < point[j]) rank[i]++;
			}
		}
		for(i = 1; i <= n; i++) System.out.println(rank[i]);
	}
}