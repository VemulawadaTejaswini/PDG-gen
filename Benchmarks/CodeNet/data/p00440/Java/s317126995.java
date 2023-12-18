import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			while(sc.hasNext()) {
				int n=sc.nextInt();
				int k=sc.nextInt();
				if(n==0) break;
				int[] card=new int[k];
				boolean[] flag=new boolean[100001];
				for(int i=0; i<k; i++) {
					card[i]=sc.nextInt();
					flag[card[i]]=true;
				}
				Arrays.sort(card);
				int[] dp=new int[100001];
				int max=0;
				int now=0;
				if(card[0]==0) {
					for(int i=1; i<=n; i++) {
						if(flag[i]) continue;
						card[now]=i;
						Arrays.sort(card);
						//System.out.println("i="+i);
						for(int j=0; j<k; j++) {
							dp[card[j]]=dp[card[j]-1]+1;
							max=Math.max(dp[card[j]], max);
							//System.out.println("dp["+card[j]+"]=dp["+(card[j]-1)+"]+1="+max);
							if(card[j]==i) now=j;
						}
						Arrays.fill(dp, 0);
					}
				}
				else {
					for(int i=0; i<k; i++) {
						dp[card[i]]=dp[card[i]-1]+1;
						max=Math.max(dp[card[i]], max);
					}
				}
				System.out.println(max);


			}
		}
	}
} 
