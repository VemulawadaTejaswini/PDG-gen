import java.util.*;

public class Main {
	int n, sum;
	String[] f;
	int[] w, s, memo, ans;
	double min;
	
	public void loop(int m, int gsum, int wsum){
		if(m==n){
			if(min>(double)gsum/wsum){
				min = (double)gsum/wsum;
				for(int i=0;i<n;i++) ans[i] = memo[i];
			}
			return;
		}
		
		for(int i=0;i<n;i++){
			boolean flag = true;
			for(int j=0;j<m;j++){
				if(memo[j]==i) flag = false;
			}
			if(flag==true){
				memo[m] = i;
				if(sum-wsum-w[i]<=s[i]){
					loop(m+1, gsum+(m+1)*w[i], wsum+w[i]);
				}
			}
		}
	}
	
	public void run(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			n = sc.nextInt();
			if(n==0) break;
			
			f = new String[n];
			w = new int[n];
			s = new int[n];
			memo = new int[n];
			Arrays.fill(memo, -1);
			ans = new int[n];
			sum = 0;
			min = Integer.MAX_VALUE;
			for(int i=0;i<n;i++){
				f[i] = sc.next();
				w[i] = sc.nextInt();
				s[i] = sc.nextInt();
				sum += w[i];
			}
			loop(0,0,0);
			for(int i=0;i<n;i++) System.out.println(f[ans[i]]);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}