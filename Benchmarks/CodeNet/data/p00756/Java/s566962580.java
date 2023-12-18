import java.util.*;
import java.math.*;
public class Main{

	static int INF = 2 << 27;
	static int m;
	static int n;
	static int k;
	static int d;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			Data[] data = new Data[n];
			for(int i = 0; i < n; i++) {
				data[i] = new Data(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
			}
			for(int i = 0; i < n; i++) {
				for(int j = i + 1; j < n; j++) {
					boolean check = check(data,i,j);
					if(check) data[j].up |= (1 << i);
				}
			}
			boolean[] dp = new boolean[1 << n];
			dp[0] = true;
			for(int i = 0; i < dp.length; i++) {
				if(!dp[i]) continue;
				ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
				for(int j = 0; j < 5; j++) {
					list.add(new ArrayList<Integer>());
				}
				for(int j = 0; j < n; j++) {
					if((i & (1 << j)) != 0 || (i & data[j].up) != data[j].up) continue;
					list.get(data[j].c).add(j);
				}
				for(int j = 1; j < 5; j++) {
					ArrayList<Integer> lX = list.get(j);
					for(int k = 0; k < lX.size()-1; k++) {
						for(int l = k + 1; l < lX.size(); l++) {
							int next = i | (1 << lX.get(k) | (1 << lX.get(l)));
							dp[next] = true;
						}
					}
				}
			}
			int max = 0;
			for(int i = 0; i < dp.length; i++) {
				if(dp[i]) max = Math.max(max, Integer.bitCount(i));
			}
			System.out.println(max);
			
		}
	}
	static boolean check(Data[] data, int a, int b) {
		int dis = (data[a].x - data[b].x) * (data[a].x - data[b].x) + (data[a].y - data[b].y) * (data[a].y - data[b].y);
		return dis < (data[a].r + data[b].r) * (data[a].r + data[b].r);
	}
	static class Data {
		int up = 0;
		int x;
		int y;
		int r;
		int c;
		Data(int a, int b, int c, int d) {
			this.x = a;
			this.y = b;
			this.r = c;
			this.c = d;
		}
	}
}