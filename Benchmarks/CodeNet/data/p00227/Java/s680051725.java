import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0227();
	}

	class AOJ0227{
		public AOJ0227() {
			while(true){
				int n = in.nextInt();//購入する野菜
				int m = in.nextInt();//袋に入る野菜
				if(n==0&&m==0)break;
				int[] p = new int[n];
				for(int i=0;i<n;i++)p[i] = in.nextInt();
				Arrays.sort(p);
				int result = 0;
				int sum = 0;
				for(int i=0;i<n;i++)sum+=p[i];
				int cnt = 0;
				for(int i=n-1;i>=0;i--){
					cnt++;
					if(cnt==m){
						cnt=0;
						result+=p[i];
					}
				}
				System.out.println(sum-result);
			}
		}
	}


}