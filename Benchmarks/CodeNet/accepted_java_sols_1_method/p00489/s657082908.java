import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] winp = new int[n];
		for(int i=0;i<n;i++)winp[i]=0;		
		for(int i=0;i<(n*(n-1)/2);i++){
			int t1 = sc.nextInt();
			int t2 = sc.nextInt();
			int p1 = sc.nextInt();
			int p2 = sc.nextInt();
			if(p1 > p2){
				winp[t1-1] += 3;
			}else if(p1 < p2){
				winp[t2-1] += 3;
			}else{
				winp[t1-1] ++;
				winp[t2-1] ++;
			}
		}
		int[] rnk = new int[winp.length];
		for(int i=0;i<rnk.length;i++){
			int cnt = 1;
			for(int j=0;j<rnk.length;j++){
				if(winp[i]<winp[j]){
					cnt++;
				}
			}
			rnk[i] = cnt++;
		}
		for(int i=0;i<n;i++){
			System.out.println(rnk[i]);
		}
	}
}	