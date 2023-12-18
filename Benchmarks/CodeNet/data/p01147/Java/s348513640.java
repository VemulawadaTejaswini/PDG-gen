import java.util.Arrays;
import java.util.Scanner;

//Princess, a Cryptanalyst
public class Main{

	int n;
	int[][] cut;
	String[][] dp;
	String[] s;
	String INF = "?";
	
	String get(int S, int last){
		if(!INF.equals(dp[S][last]))return dp[S][last];
		int ns = S-(1<<last);
		if(ns==0)return dp[S][last] = s[last];
		String res = INF;
		for(int k=0;k<n;k++){
			if(((ns>>k)&1)==0)continue;
			String r = get(ns, k)+s[last].substring(cut[k][last]);
			if(comp(r, res)<0)res = r;
		}
		return dp[S][last] = res;
	}
	
	int comp(String a, String b){
		if(INF.equals(a))return 1;
		if(INF.equals(b))return -1;
		if(a.length()!=b.length())return a.length()-b.length();
		return a.compareTo(b);
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int N = sc.nextInt();
			if(N==0)break;
			String[] t = new String[N];
			for(int i=0;i<N;i++)t[i]=sc.next();
			boolean[] del = new boolean[N];
			for(int i=0;i<N;i++)for(int j=0;j<N;j++){
				if(i==j)continue;
				if(t[i].contains(t[j]))del[j] = true;
			}
			n = 0;
			for(boolean f:del)if(!f)n++;
			s = new String[n];
			int id = 0;
			for(int i=0;i<N;i++)if(!del[i])s[id++] = t[i];
			cut = new int[n][n];
			for(int i=0;i<n;i++)for(int j=0;j<n;j++){
				if(i==j)continue;
				for(int k=0;k<s[i].length();k++){
					if(s[j].startsWith(s[i].substring(k))){
						cut[i][j] = s[i].length()-k; break;
					}
				}
			}
			dp = new String[1<<n][n];
			for(String[]a:dp)Arrays.fill(a, INF);
			String res = INF;
			for(int i=0;i<n;i++){
				String r = get((1<<n)-1, i);
				if(comp(r, res)<0)res = r;
			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}