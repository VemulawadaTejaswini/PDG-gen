import java.util.*;

public class Main{
	static int[] count;

	static void solve(int n,int m,int sum){
		if(n == 0){
			count[sum]++;
			return;
		}
		for(int i=1;i<=m;i++) solve(n-1,m,sum+i);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n=sc.nextInt(), m=sc.nextInt(), k=sc.nextInt();
			if(n==0 && m==0 && k==0) break;

			count = new int[m*n+1];
			solve(n,m,0);

			int ans = 0;
			for(int i=0;i<count.length;i++){
				ans += (i>k ? i-k : 1) * count[i];
			}
			System.out.printf("%.8f\n", ans / Math.pow(m,n));
		}
	}
}