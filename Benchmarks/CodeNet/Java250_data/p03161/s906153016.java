	import java.util.*;
	import java.io.*;
class Main{
		static int n,arr[],k	;
		static long dp[];
		public static void main(String[] args) throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int t=1;
	//		Integer.parseInt(br.readLine().trim());
			StringBuilder printans=new StringBuilder();
			while(t-->0)
			{
				StringTokenizer tok=new StringTokenizer(br.readLine()," ");
				n=Integer.parseInt(tok.nextToken());
				k=Integer.parseInt(tok.nextToken());
				
				arr=new int[n];
				tok=new StringTokenizer(br.readLine()," ");
				for(int i=0;i<n;i++) {
					arr[i]=Integer.parseInt(tok.nextToken());
				
				}
				dp=new long[n];
//				memset();
				
				printans.append(call());
			    
			}
			System.out.println(printans);
	
		}
		
		static long call() {
			dp[0]=0;
			dp[1]=Math.abs(arr[1]-arr[0]);
			for(int i=2;i<n;i++) {
				long temp=Integer.MAX_VALUE;
				for(int j=i-k;j<i ;j++){
					if(j>=0) {
						temp=Math.min(temp,dp[j]+Math.abs(arr[i]-arr[j]));
					}
//					
				}
				dp[i]=temp;
				
			}
//			System.out.println(Arrays.toString(dp));
			return dp[dp.length-1];
		}
	
	}
