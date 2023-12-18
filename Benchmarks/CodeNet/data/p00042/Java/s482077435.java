import java.util.*;
public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}

	public Main(){		
		new AOJ0042();
	}
	class AOJ0042{
//		int w,n;
//		tresure[] takara;
		public AOJ0042() {
			int c=1;
			while(true){
				int w = in.nextInt();
				if(w==0)break;
				int n = in.nextInt();
				tresure[] takara = new tresure[n];
				for(int i=0;i<n;i++){
					String[] a = in.next().split(",");
					takara[i]=new tresure(Integer.parseInt(a[0]),Integer.parseInt(a[1]));
				}
				int[] dp = new int[w+1];
				for(int s=0;s<n;s++){
					for(int i=0;i<=w;i++)if(dp[i]>0){
						if(takara[s].heavy+i<=w)dp[takara[s].heavy+i]=Math.max(dp[takara[s].heavy+i],dp[i]+takara[s].money);
					}
					if(takara[s].heavy<=w)dp[takara[s].heavy]=Math.max(dp[takara[s].heavy],takara[s].money);
				}
				int max_heavy=0;
				int max_money=0;
				for(int i=0;i<w;i++)if(max_money<dp[i]){
					max_money=dp[i];
					max_heavy=i;
				}
				System.out.println("Case "+c+":");
				System.out.println(max_money);
				System.out.println(max_heavy);
			}
		}
		class tresure{
			int money,heavy;
			public tresure(int money,int heavy) {
				this.money=money;
				this.heavy=heavy;
			}
		}
	}
}