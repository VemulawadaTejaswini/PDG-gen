import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int N = in.nextInt();
			int M = in.nextInt();
			if(N==0) break;
			int[] h = new int[N+1];
			int[] w = new int[M+1];
			int[] hnum = new int[1500001];
			int[] wnum = new int[1500001];
			
			for(int i=1;i<=N;i++){
				h[i] = in.nextInt()+h[i-1];
			}
			for(int i=1;i<=M;i++){
				w[i] = in.nextInt()+w[i-1];
			}
			
			for(int i=1;i<=N;i++){
				for(int j=i;j<=N;j++){
					hnum[h[j]-h[i-1]] ++;
				}
			}
			for(int i=1;i<=M;i++){
				for(int j=i;j<=M;j++){
					wnum[w[j]-w[i-1]] ++;
				}
			}
			
			long ans = 0;
			for(int i=1;i<=1500000;i++){
				ans += ((long)hnum[i]) * wnum[i];
			}
			
			System.out.println(ans);
		}
		
	}
}