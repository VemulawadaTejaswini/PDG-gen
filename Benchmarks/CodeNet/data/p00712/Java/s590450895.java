import java.util.*;
public class Main {
	int p,q,a,n;
	int ans;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			p = sc.nextInt();
			q = sc.nextInt();
			a = sc.nextInt();
			n = sc.nextInt();
			if((p|q|a|n) == 0) break;
			ans = 0;
			dfs(0,0,1,1, 1);
			System.out.println(ans);
		}
	}
	
	private void dfs(int deep, int aa, int bb, int mul,int  prev) {
		
//		if(aa == p && bb == q){
//			ans++;
//			return ;
//		}
		if(ismatch(aa,bb)){
			ans++;
			return ;
		}
//		if(deep == n - 1){
//			int [] res = sub(aa,bb);
//			if(res[1] * mul <= a && res[1] >= prev){
//				ans++;
//			}
//			return ;
//		}
		if(deep == n) return;
		if(isbig(aa, bb))return;
		
		for(int i = prev; i * mul <= a; i++){
			int [] res = calc(aa,bb, 1, i);
			dfs(deep + 1, res[0], res[1], i * mul, i);
		}
	}

	private boolean ismatch(int aa, int bb) {
		int a = p * bb;
		int b = q * aa;
		if(a == b) return  true;
		return false;
	}

	private int[] sub(int aa, int bb) {
		int a = p * bb;
		int b = q * aa;
		int c = q * bb;
		int d = a - b;
		int g = gcd(d, c);
		int [] res = {d / g, c / g};
		return res;
	}

	private boolean isbig(int aa, int bb) {
		int a = p * bb;
		int b = q * aa;
		if(a < b) return true;
		return false;
	}

	private int[] calc(int aa, int bb, int cc, int dd) {
		int [] res = new int[2];
		int up = bb * cc + aa * dd;
		int down = bb * dd;
		res[0] = up;
		res[1] = down;
		return res;
	}

	private int gcd(int a, int b) {
		if(b == 0){
			return a;
		}
		else{
			return gcd(b, a % b);
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}