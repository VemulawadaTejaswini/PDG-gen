import java.util.*;

public class Main {

	class Frac{
		int a, b;
		Frac(int _a, int _b){
			int d = gcd(_a,_b);
			this.a = _a/d;
			this.b = _b/d;
		}
		
		Frac add(Frac x){
			Frac r = new Frac(this.a*x.b + this.b*x.a, this.b*x.b);
			if(r.a == 0) return new Frac(0,1);
			int d = gcd(r.a,r.b);
			r.a /= d;
			r.b /= d;
			return r;
		}
		Frac sub(Frac x){
			Frac r = new Frac(this.a*x.b - this.b*x.a, this.b*x.b);
			if(r.a == 0) return new Frac(0,1);
			int d = gcd(r.a,r.b);
			r.a /= d;
			r.b /= d;
			return r;
		}
	}

	int p, q, a, n, ans;
	Frac target;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			p = in.nextInt(); q = in.nextInt(); a = in.nextInt(); n = in.nextInt();
			if(q==0) return ;
			System.out.println(solve());
		}
	}

	int gcd(int x, int y){ return x<0?gcd(-x,y):y==0?x:gcd(y,x%y); }

	int solve(){
		ans = 0;
		target = new Frac(p,q);
		dfs(1,1,0);
		return ans;
	}
	
	void dfs(int low, int multi, int depth){
		if(depth == n) return ;
		for(int i=low; i*multi <= a; i++){
			Frac t = new Frac(1,i);
			target = target.sub(t);
			if(target.a == 0){
				ans++;
			}
			else if(target.a > 0){
				dfs(i,multi*i,depth+1);
			}
			target = target.add(t);
		}
	}

	public static void main(String args[]){
		new Main().run();
	}
}