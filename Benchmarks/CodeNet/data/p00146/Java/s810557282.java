
import java.util.*;

public class Main {

	class C {
		double time;
		int w,dis;
		ArrayList<Integer> list;
		public C(double time, int w, int dis, ArrayList<Integer> list) {
			this.time = time;
			this.w = w;
			this.dis = dis;
			this.list = list;
		}
		@Override
		public String toString() {
			return "C [time=" + time + ", w=" + w + ", dis=" + dis + ", list="
					+ list + "]";
		}
	}

	private double calc(int dis, int w){
		double ans = (double)dis / (2000.0 / (70 + w * 20));
		return ans;
	}

	private void doit() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int len = 1 << n;
		int [] numlist = new int[n];
		int [] dislist = new int[n];
		int [] wlist = new int[n];
		C [][] dp = new C[n][len];
		for(int i=0; i < n; i++){
			numlist[i] = sc.nextInt();
			dislist[i] = sc.nextInt();
			wlist[i] = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(numlist[i]);
			dp[i][1 << i] = new C(0.0,wlist[i],dislist[i],list);
		}
		for(int i = 1 ; i < len; i++) {

			for(int j = 0; (1 << j) < len; j++){
				if((i & (1 << j)) == 0){
					int nextnum = i | (1 << j);
					C min = null;
					for(int k = 0; k < n ; k++){
						if(dp[k][i] == null){
							continue;
						}
						if(min == null){
							min = dp[k][i];
						}
						double mintime = min.time + calc(Math.abs(min.dis - dislist[j]), min.w);
						double nowtime = dp[k][i].time + calc(Math.abs(dp[k][i].dis - dislist[j]), dp[k][i].w);
						if(mintime > nowtime){
							min = dp[k][i];
						}
					}
					ArrayList<Integer> nextlist = new ArrayList<Integer>();
					nextlist.addAll(min.list);
					nextlist.add(numlist[j]);
					double nexttime = min.time + calc(Math.abs(min.dis - dislist[j]), min.w);
					int nextw = min.w + wlist[j];
					int nextdis = dislist[j];
					dp[j][nextnum] = new C(nexttime, nextw, nextdis, nextlist);
				}
			}
		}

		//print
		C ans = null;
		for(int i =0; i < n;i++){
			if(ans == null){
				ans = dp[i][len-1];
			}

			if(ans.time > dp[i][len-1].time){
				ans = dp[i][len-1];
			}
		}
		for(int i = 0; i < ans.list.size() - 1;i++){
			System.out.print(ans.list.get(i) + " ");
		}
		System.out.println(ans.list.get(n - 1));

		//debug
//		for(int i = 1; i < len; i++){
//			for(int j = 0; j < n; j++){
//				if(dp[j][i] == null){
//					System.out.println("null");
//				}
//				else{
//					System.out.println(dp[j][i].toString() + " ");
//				}
//
//			}
//			System.out.println();
//		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();

	}

}