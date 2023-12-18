import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//It Prefokery Pio
public class Main{

	int[][] dp;
	int[][] pre;
	int n, M = 2000;
	List<Integer>[] p;
	char[] s;
	
	int get(int L, int R){
		if(R<L)return 0;
		if(dp[L][R]!=-1)return dp[L][R];
		if(L==R){
			pre[L][R] = (L+1)*M+(R-1);
			return dp[L][R]=1;
		}
		if(L+1==R){
			if(s[L]!=s[R])return 0;
			pre[L][R] = (L+1)*M+(R-1);
			return dp[L][R]=2;
		}
		int max = 0;
		int pl = -1, pr = -1;
		for(int c=0;c<26;c++){
			int left = -1, right = -1;
			for(int x:p[c]){
				if(R<x)break;
				if(x<L)continue;
				left = x; break;
			}
			for(int x=p[c].size()-1;x>=0;x--){
				int pos = p[c].get(x);
				if(pos<L)break;
				if(R<pos)continue;
				right = pos; break;
			}
			if(left==-1||right==-1)continue;
			int v = (left==right?1:2)+get(left+1, right-1);
			if(max<v){
				max = v; pl = left; pr = right;
			}
		}
		pre[L][R] = (pl+1)*M+(pr-1);
		return dp[L][R] = max;
	}
	
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			s = sc.next().toCharArray();
			n = s.length;
			p = new List[26];
			for(int i=0;i<26;i++)p[i]=new ArrayList<Integer>();
			for(int i=0;i<n;i++)p[s[i]-'A'].add(i);
			dp = new int[n][n]; pre = new int[n][n];
			for(int[]a:dp)Arrays.fill(a, -1);
			for(int[]a:pre)Arrays.fill(a, -1);
			get(0, n-1);
			List<Integer> t = new ArrayList<Integer>();
			StringBuilder res = new StringBuilder();
			int L = 0, R = n-1;
			while(pre[L][R]>=0){
				int nl = pre[L][R]/M, nr = pre[L][R]%M;
				if(nl-1!=nr+1)t.add(nr+1);
				res.append(s[nl-1]);
				L = nl; R = nr;
			}
			for(int i=t.size()-1;i>=0;i--)res.append(s[t.get(i)]);
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}