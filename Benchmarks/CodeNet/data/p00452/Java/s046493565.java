import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Darts
public class Main{

	void run(){
		Scanner sc = new Scanner();
		for(;;){
			int n = sc.nextInt(), m = sc.nextInt();
			if((n|m)==0)break;
			int[] p = new int[n+1];
			for(int i=0;i<n;i++)p[i]=sc.nextInt();
			Set<Integer> set = new HashSet<Integer>();
			for(int i=0;i<=n;i++)for(int j=0;j<=i;j++)if(p[i]+p[j]<=m)set.add(p[i]+p[j]);
			int[] a = new int[set.size()];
			int N = 0;
			for(int x:set)a[N++] = x;
			Arrays.sort(a);
			int max = 0;
			int s = 0;
			int t = N-1;
			while(s<=t){
				if(a[s]+a[t]<=m){
					max=Math.max(max, a[s]+a[t]);
					s++;
				}
				else t--;
			}
			System.out.println(max);
		}
	}

	class Scanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-') return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}
	}	
	public static void main(String[] args) {
		new Main().run();
	}
}