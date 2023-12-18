import java.util.*;


public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n= sc.nextInt();
			if(n==0)break;
			int[] b = new int[n];//ビル番号
			int[] x = new int[n];//x座標
			int[] y = new int[n];//y座標
			for(int i=0;i<n;i++){
				b[i] = sc.nextInt();
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			int m = sc.nextInt();
			double[][] dis = new double[n+1][n+1];//各点からの距離
			for(int i=1;i<=n;i++){
				for(int j=1;j<=n;j++){
					dis[i][j] = Math.sqrt((Math.pow(x[i-1]-x[j-1],2)+Math.pow(y[i-1]-y[j-1], 2)));
				}
			}
			double[] dp = new double[n+1];//スタートからの距離
			Arrays.fill(dp,Integer.MAX_VALUE);
			//dp[0]=0;
			boolean[] flag = new boolean[n+1];
			int s,g;//スタート, ゴール
			for(int i=0;i<m;i++){
				s = sc.nextInt();
				g = sc.nextInt();
				flag[s]=true;
				dp[s]=0;
				int now = s;
				int next=0;
				double temp_min=Integer.MAX_VALUE;
				String result = g+" ";
				int[] pre = new int[n+1];
				boolean check=false;
				boolean isNA = false;
				for(;;){
					for(int j=1;j<=n;j++){
						if(dis[now][j]<=50&&!flag[j]){
							isNA=true;
							//System.out.print(now+" "+j+" "+dp[now]+" "+dp[j]+" "+dis[now][j]);
							double before = dp[j];
							double c = dp[now]+dis[now][j];
							dp[j]=Math.min(before, c);
							if(dp[j]==c){
								if(dp[j]!=before){
									pre[j] = now;
								}
							}
							//System.out.println(" "+dp[j]);
							if(temp_min>dp[j]){
								temp_min = dp[j];
								//preserve[next]=j;
								next = j;
								check=true;
							}
						}
					}
					temp_min=Integer.MAX_VALUE;
					now = next;
					flag[now]=true;
					if(now ==g) break;
					if(!isNA) break;
					isNA = false;
				}
				int n2= g;
				int count=0;
				for(int xx:pre){
					//System.out.println(count+" "+xx);
					count++;
				}
				StringBuffer sb = new StringBuffer();

				for(;;){
					if(n2==s)break;
					sb.insert(0,pre[n2]+" ");
					if(pre[n2]==0){
						result = "NA";
						break;
					}
					//result+=pre[n2]+" ";
					n2 = pre[n2];
				}
				if(!result.equals("NA")){
					result =sb.toString()+g;
				}
				System.out.println(result);
			}
		}
	}
}