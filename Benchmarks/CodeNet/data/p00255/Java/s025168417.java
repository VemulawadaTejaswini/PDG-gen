import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ0260().doIt();
	}
	
	class AOJ0260{
		int n;
		int[] p,j;
		void solve(){
			Arrays.sort(j);
//			System.out.println(Arrays.toString(j));
			int sum = 0;
			int cnt = n;
			for(int i=0;i<n;i++)sum+=p[i];
			int max = sum*cnt;
			for(int i=n-2;i>=0;i--){
//				System.out.println(sum+" "+cnt+" "+max);
				sum = sum+j[i];
				cnt--;
				int calc = sum*cnt;
//				System.out.println(calc);
				max = Math.max(max, calc);
			}
			System.out.println(max);
		}
		
		void doIt(){
			while(in.hasNext()){
				n = in.nextInt();
				if(n==0)break;
				p = new int[n];
				j = new int[n-1];
				for(int i=0;i<n;i++)p[i] = in.nextInt();
				for(int i=0;i<n-1;i++)j[i] = in.nextInt();
				solve();
			}
		}
	}
	
}