import java.util.*;

public class Main{
	
	int INF = 1 << 24;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String [] input = sc.nextLine().split(" ");
			int size = Integer.parseInt(input[0]);
			int [] r = new int[input.length - 1];
			for(int i = 1; i < input.length; i++){
				r[i-1] = Integer.parseInt(input[i]) ;
			}
			int len = r.length;
			double [][] dp = new double[1 << len][len];
			for(int i = 0; i < (1 << len); i++){
				Arrays.fill(dp[i], INF);
			}
			for(int i = 0; i < len; i++){
				dp[1 << i][i] = r[i];
			}
			
			for(int i = 0; i < (1 << len); i++){
				for(int j = 0; j < len; j++){
					if(dp[i][j] == INF) continue;
					for(int k = 0; k < len;k++){
						if((i & (1 << k)) !=0 ) continue;
						int next = (i | (1 << k));
						int c = r[j] + r[k];
						int b = Math.abs(r[j] - r[k]);
						double a = Math.sqrt(c * c - b * b);
						double value = dp[i][j] + a;
						dp[next][k] = Math.min(dp[next][k], value);
					}
				}
			}
			
			double min = INF;
			int len2 = (1 << len) - 1;
			for(int i = 0 ; i < len ; i++){
				min = Math.min(min, dp[len2][i] + r[i]);
			}
			if(min <= size){
				System.out.println("OK");
			}
			else{
				System.out.println("NA");
			}
		}
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}