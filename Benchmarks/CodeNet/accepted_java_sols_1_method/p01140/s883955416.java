import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			int ans = 0;
			int[] h = new int[n+1];
			int[] w = new int[m+1];
			for(int i=1;i<=n;i++) h[i] = h[i-1] + sc.nextInt();
			int[] len = new int[h[n]+1];
			for(int i=1;i<=n;i++){
				for(int j=i-1;j>=0;j--) len[h[i]-h[j]]++;
			}
			int p;
			for(int i=1;i<=m;i++){
				w[i] = w[i-1] + sc.nextInt();
				for(int j=i-1;j>=0;j--){
					p = w[i]-w[j];
					if(p<=h[n] && len[p]>0) ans += len[p];
				}
			}
			System.out.println(ans);
		}	
	}	
}