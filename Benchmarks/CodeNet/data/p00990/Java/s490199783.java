import java.util.*;

public class Main {
	int n, m, cnt, even, odd, sumA, sumB;
	char[] c;
	int[] a, e, o, p;
	
	
	void loopA(int x, int y){
		if(y==odd){
			loopB(0,0);
		}else{
			for(int i=x;i<m;i++){
				o[a[i]]++;
				loopA(i, y+1);
				o[a[i]]--;
			}
		}
	}
	
	void loopB(int x, int y){
		if(y==even){
			check();
		}else{
			for(int i=x;i<m;i++){
				e[a[i]]++;
				loopB(i, y+1);
				e[a[i]]--;
			}
		}
	}
	
	void check(){
		sumB = 0;
		for(int i=0;i<10;i++){
			sumB += i*o[i] + i*e[i]*2;
			if(i>=5) sumB -= 9*e[i];
		}
		if((sumA+sumB)%10==0){
			int p1 = 1;
			for(int i=0;i<10;i++) p1 *= p[o[i]];
			int p2 = 1;
			for(int i=0;i<10;i++) p2 *= p[e[i]];
			cnt += (p[odd]*p[even])/(p1*p2);
		}
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		c = sc.next().toCharArray();
		sumA = 0;
		even = 0;
		odd = 0;
		int i=n-1;
		while(true){
			if(c[i]=='*') odd++;
			else sumA += (int)c[i]-48;
			i--;
			if(i<0) break;
			if(c[i]=='*') even++;
			else sumA += ((int)c[i]-48)*2;
			if(((int)c[i]-48)*2>=10) sumA -= 9;
			i--;
			if(i<0) break;
		}
		
		m = sc.nextInt();
		a = new int[m];
		e = new int[10];
		o = new int[10];
		p = new int[]{1,1,2,6,24,120,720,5040};
		for(int j=0;j<m;j++) a[j] = sc.nextInt();
		
		cnt = 0;
		loopA(0, 0);
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}