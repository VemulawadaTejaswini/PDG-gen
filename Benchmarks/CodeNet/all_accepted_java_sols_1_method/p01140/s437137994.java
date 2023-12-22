import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int n = in.nextInt(), m = in.nextInt();
			if(n==0 && m==0) break;
			int dict[] = new int[1500*1000 + 2];
			int hs[] = new int[n+1];
			int ws[] = new int[m+1];
			for(int i=1; i<=n; i++) hs[i] = in.nextInt() + hs[i-1];
			for(int i=1; i<=m; i++) ws[i] = in.nextInt() + ws[i-1];
			for(int i=0; i<=n; i++){
				for(int j=i+1; j<=n; j++){
					dict[hs[j]-hs[i]]++;
				}
			}
			int ans = 0;
			for(int i=0; i<=m; i++){
				for(int j=i+1; j<=m; j++){
					ans += dict[ws[j]-ws[i]];
				}
			}
			System.out.println(ans);
		}
	}

}