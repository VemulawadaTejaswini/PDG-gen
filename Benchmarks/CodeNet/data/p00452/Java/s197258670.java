import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			int[] p = new int[n+1];
			for(int i=1;i<=n;i++) p[i] = sc.nextInt();
			
			int[] q = new int[((n+2)*(n+1))/2];
			int r = 0;
			for(int i=0;i<=n;i++){
				for(int j=i;j<=n;j++){
					q[r] = p[i]+p[j];
					r++;
				}
			}
			Arrays.sort(q);
			
			int ans = 0;
			for(int i=0;i<r;i++){
				for(int j=r-1;j>=0;j--){
					if(q[i]+q[j]<=m){
						ans = Math.max(ans, q[i]+q[j]);
						break;
					}
				}
			}
			System.out.println(ans);
		}	
	}	
}