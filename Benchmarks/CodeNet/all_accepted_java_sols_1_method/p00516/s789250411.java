import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// INPUT
		int n = sc.nextInt(); // 競技の数
		if(n < 1 || n > 1000) {
			System.out.println("範囲外の入力");
			System.exit(-1);
		}
		int m = sc.nextInt(); // 審査員の人数
		if(m < 1 || m > 1000) {
			System.out.println("範囲外の入力");
			System.exit(-1);
		}
		int[] cost = new int[n]; // 実施費用が格納される配列
		for(int i=0; i<n; i++) {
			cost[i] = sc.nextInt();
			if(cost[i] < 1 || cost[i] > 1000) {
				System.out.println("範囲外の入力");
				System.exit(-1);
			}
		}
		int[] judge = new int[m]; // 審査基準が格納される配列
		for(int i=0; i<m; i++) {
			judge[i] = sc.nextInt();
			if(judge[i] < 1 || judge[i] > 1000) {
				System.out.println("範囲外の入力");
				System.exit(-1);
			}
		}
		
		// PROCESS
		int[] vote = new int[n]; // 投票数をカウントする配列
		for(int i=0; i<m; i++) { // 配列judgeを参照
			for(int k=0; k<n; k++) { // 配列costと配列voteを参照
				if(judge[i] >= cost[k]) {
					vote[k]++;
					break;
				}
				// System.out.printf("vote[%d] = %d\n", k, vote[k]);
			}
		}
		// 得票数の高い競技を導く処理
		int max = 0;
		int maxidx = 0;
		for(int i=0; i<n; i++) {
			if(vote[i] > max) {
				max = vote[i];
				maxidx = i+1; // 要素番号+1が競技番号
			}
		}
		// OUTPUT
		System.out.println(maxidx);
	}
}