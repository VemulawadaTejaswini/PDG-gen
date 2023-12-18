import java.util.*;


public class Main {
	public static void main(String args[]){
		List<HashSet<Integer>> able = new ArrayList<HashSet<Integer>>();
		long[][] dp = new long[30+1][50+1];
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0) break;
			for(int i=0;i<31;i++){
				for(int j=0;j<51;j++){
					dp[i][j] = 0;
				}
			}
			for(int i=0;i<n+1;i++){
				long ppp = 1L << i;
				dp[0][i] =ppp;
			}
			//ここまで初期化
			int p,q;
			//List<HashSet<Integer>> able = new ArrayList<HashSet<Integer>>();
			//HashSet<Integer> hs = new HashSet<Integer>();
			for(int i=0;i<31;i++){
				HashSet<Integer> hs = new HashSet<Integer>();
				able.add(hs);
			}
			HashSet<Integer> hs = new HashSet<Integer>();
			for(int i=1;i<n+1;i++){
				p=sc.nextInt();
				for(int j=0;j<p;j++){
					q=sc.nextInt();//日程
					//long ppp = 1 << i;
					hs = able.get(q);
					hs.add(i);
					able.set(q, hs);
				}
			}
			long bitc;
			int result=-1;
			for(int i=1;i<31;i++){
				long ch = 0;
				hs = able.get(i);
				for(int contents : hs){
					ch |= dp[i-1][contents];
				}
				for(int contents : hs){
					dp[i][contents]  = ch;
				}
				for(int j=1;j<n+1;j++){
					if(dp[i][j]==0){
						dp[i][j] = dp[i-1][j];
					}
				}

				bitc = Long.bitCount(ch);
				//System.out.println("i="+i+" j="+j+" bitc="+bitc+" dp="+dp[i][j]);
				if(bitc == n){
					result = i;
					break;
				}
			}
			//if(result == 0) result = -1;
			System.out.println(result);
			able.clear();
		}
	}
}