import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	LinkedList<Integer> array = new LinkedList<Integer>();
	public void run() {
			int n = sc.nextInt();
		calc(n);
	}
	
	public void calc(int n){
		int[][] gyouretsu = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				gyouretsu[i][j] = 0;
			}
		}
		for(int i = 0; i < n; i++){
			int u = sc.nextInt();
			int k = sc.nextInt();
			for(int j = 0; j < k; j++){
				int v = sc.nextInt();
				gyouretsu[u-1][v-1] = 1;
			}
		}
		int[] ans = new int[n];
		for(int i = 0; i < n; i++){
			ans[i] = -1;
		}
		array.push(0);
		rec(gyouretsu, 0, ans);
		for(int i = 0; i < n; i++){
			System.out.println(i+1 + " " + ans[i]);
		}
	}
	public void rec(int[][] gyouretsu, int t, int[] ans){
		int s = array.size();
		for(int i = 0; i < s; i++){
			int now = array.get(i);
			ans[now] = t;
		}
		for(int i = 0; i < s; i++){
			int now = array.get(0);
			array.remove(0);
			for(int j = gyouretsu[now].length - 1; j > -1; j--){
				if(gyouretsu[now][j] == 1 && ans[j] == -1){
					array.push(j);
				}
			}
		}
		if(array.size() != 0){
		rec(gyouretsu, t+1, ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}