import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//It Prefokery Pio
public class Main{

	int[][] dp;
//	int[][] pre;
	int n, M = 2000;
	List<Integer>[] p;
//	Map<Integer, Integer>[] mem;
	Map<Integer, Integer>[] past;
	char[] s;
	
	int bsdown(int c, int L, int R){
		int n = p[c].size();
		if(n==0)return -1;
		int l=0, r=n-1;
		while(r-l>1){
			int m = (l+r)/2;
			int x = p[c].get(m);
			if(x<L)l=m;
			else r=m;
		}
		int left = p[c].get(l), right = p[c].get(r);
		if(L<=left&&left<=R)return left;
		else if(L<=right&&right<=R)return right;
		return -1;
	}
	int bsup(int c, int L, int R){
		int n = p[c].size();
		if(n==0)return -1;
		int l=0, r=n-1;
		while(r-l>1){
			int m = (l+r)/2;
			int x = p[c].get(m);
			if(R<x)r=m;
			else l=m;
		}
		int left = p[c].get(l), right = p[c].get(r);
		if(L<=right&&right<=R)return right;
		else if(L<=left&&left<=R)return left;
		return -1;
	}
	
	int get(int L, int R){
		if(R<L)return 0;
//		if(mem[L].containsKey(R))return mem[L].get(R);
		if(dp[L][R]!=-1)return dp[L][R];
		if(L==R){
			past[L].put(R, (L+1)*M+(R-1));
//			mem[L].put(R, 1);
//			return 1;
//			pre[L][R] = (L+1)*M+(R-1);
			return dp[L][R]=1;
		}
		if(L+1==R){
			if(s[L]!=s[R])return 0;
			past[L].put(R, (L+1)*M+(R-1));
//			mem[L].put(R, 2);
//			return 2;
//			pre[L][R] = (L+1)*M+(R-1);
			return dp[L][R]=2;
		}
		int max = 0;
		int pl = -1, pr = -1;
		for(int c=0;c<26;c++){
			int left = -1, right = -1;
			left = bsdown(c, L, R); right = bsup(c, L, R);
//			System.out.println("L:"+L+"left:"+left+" right:"+right+" R:"+R);
//			for(int x:p[c]){
//				if(R<x)break;
//				if(x<L)continue;
//				left = x; break;
//			}
//			for(int x=p[c].size()-1;x>=0;x--){
//				int pos = p[c].get(x);
//				if(pos<L)break;
//				if(R<pos)continue;
//				right = pos; break;
//			}
			if(left==-1||right==-1)continue;
			int v = (left==right?1:2)+get(left+1, right-1);
			if(max<v){
				max = v; pl = left; pr = right;
			}
		}
		past[L].put(R, (pl+1)*M+(pr-1));
//		mem[L].put(R, max);
//		return max;
//		pre[L][R] = (pl+1)*M+(pr-1);
		return dp[L][R] = max;
	}
	
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
//		String f = "";
//		for(int i=0;i<2000;i++){
//			f+=(char)(i%26+'A');
//		}
//		System.out.println(f);
		while(sc.hasNext()){
			s = sc.next().toCharArray();
			long T = System.currentTimeMillis();
			n = s.length;
			p = new List[26];
			for(int i=0;i<26;i++)p[i]=new ArrayList<Integer>();
			for(int i=0;i<n;i++)p[s[i]-'A'].add(i);
			dp = new int[n][n]; 
//			pre = new int[n][n];
			for(int[]a:dp)Arrays.fill(a, -1);
//			for(int[]a:pre)Arrays.fill(a, -1);
//			mem = new HashMap[n];
			past = new HashMap[n];
			for(int i=0;i<n;i++){
//				mem[i]=new HashMap<Integer, Integer>();
				past[i]=new HashMap<Integer, Integer>();
			}
			get(0, n-1);
			List<Integer> t = new ArrayList<Integer>();
			StringBuilder res = new StringBuilder();
			int L = 0, R = n-1;
			while(past[L].containsKey(R)){
				int x = past[L].get(R);
				if(x<0)break;
//				System.out.println("X:"+x);
				int nl = x/M, nr = x%M;
//				System.out.println(nl+" "+nr);
				if(nl-1!=nr+1)t.add(nr+1);
				res.append(s[nl-1]);
				L = nl; R = nr;
			}
//			while(pre[L][R]>=0){
//				int nl = pre[L][R]/M, nr = pre[L][R]%M;
//				if(nl-1!=nr+1)t.add(nr+1);
//				res.append(s[nl-1]);
//				L = nl; R = nr;
//			}
//			System.out.println(mem[0].get(n-1));
			for(int i=t.size()-1;i>=0;i--)res.append(s[t.get(i)]);
			System.out.println(res);
			System.out.println((System.currentTimeMillis()-T));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}