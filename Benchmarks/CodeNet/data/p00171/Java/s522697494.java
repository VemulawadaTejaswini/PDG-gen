import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			d = new Dice[8];
			for(int i=0;i<8;i++){
				char[] s = sc.next().toCharArray();
				if(s[0] == '0') return;
				d[i] = new Dice(s[0],s[1],s[2],s[3],s[4],s[5]);
			}

			t = new Dice[8];
			used = new boolean[8];
			System.out.println(solve()?"YES":"NO");
		}
	}

	private static Dice[] d;
	private static Dice[] t;
	private static boolean[] used;

	private static boolean solve(){
		for(int i=0;i<8;i++){
			if(used[i]) continue;
			used[i] = true;
			Dice nd = d[i].copy();

			for(int j=0;j<2;j++){
				for(int k=0;k<4;k++){
					for(int l=0;l<4;l++){
						t[0] = nd;
						if(solve1()) return true;
						nd = nd.move(0);
					}
					nd = nd.move(1);
				}
				nd = nd.move(2);
				if(j==1) nd = nd.move(2);
			}
			used[i] = false;
		}
		return false;
	}

	private static boolean solve1(){
		for(int i=0;i<8;i++){
			if(used[i]) continue;
			used[i] = true;
			Dice nd = d[i].getDice(t[0].n,1);
			if(nd != null){
				for(int j=0;j<4;j++){
					t[1] = nd;
					if(solve2()) return true;
					nd = nd.move(1);
				}
			}
			used[i] = false;
		}
		return false;
	}

	private static boolean solve2(){
		for(int i=0;i<8;i++){
			if(used[i]) continue;
			used[i] = true;
			Dice nd = d[i].getDice(t[1].w,2);
			if(nd != null){
				for(int j=0;j<4;j++){
					t[2] = nd;
					if(solve3()) return true;
					nd = nd.move(0);
				}
			}
			used[i] = false;
		}
		return false;
	}

	private static boolean solve3(){
		for(int i=0;i<8;i++){
			if(used[i]) continue;
			used[i] = true;
			Dice nd = d[i].getDice(t[2].s,4);
			if(nd != null){
				for(int j=0;j<4;j++){
					t[3] = nd;
					if(Math.abs(nd.e-t[0].w)==32 && solve4()) return true;
					nd = nd.move(1);
				}
			}
			used[i] = false;
		}
		return false;
	}

	private static boolean solve4(){
		for(int i=0;i<8;i++){
			if(used[i]) continue;
			used[i] = true;
			Dice nd = d[i].getDice(t[3].b,0);
			if(nd != null){
				for(int j=0;j<4;j++){
					t[4] = nd;
					if(solve5()) return true;
					nd = nd.move(2);
				}
			}
			used[i] = false;
		}
		return false;
	}

	private static boolean solve5(){
		for(int i=0;i<8;i++){
			if(used[i]) continue;
			used[i] = true;
			Dice nd = d[i].getDice(t[4].n,1);
			if(nd != null){
				for(int j=0;j<4;j++){
					t[5] = nd;
					if(Math.abs(nd.t-t[2].b)==32 && solve6()) return true;
					nd = nd.move(1);
				}
			}
			used[i] = false;
		}
		return false;
	}

	private static boolean solve6(){
		for(int i=0;i<8;i++){
			if(used[i]) continue;
			used[i] = true;
			Dice nd = d[i].getDice(t[5].e,3);
			if(nd != null){
				for(int j=0;j<4;j++){
					t[6] = nd;
					if(Math.abs(nd.t-t[1].b)==32 && solve7()) return true;
					nd = nd.move(0);
				}
			}
			used[i] = false;
		}
		return false;
	}

	private static boolean solve7(){
		for(int i=0;i<8;i++){
			if(used[i]) continue;
			used[i] = true;
			Dice nd = d[i].getDice(t[6].s,4);
			if(nd != null){
				for(int j=0;j<4;j++){
					if(Math.abs(nd.t-t[0].b)==32 && Math.abs(nd.w-t[4].e)==32) return true;
					nd = nd.move(1);
				}
			}
			used[i] = false;
		}
		return false;
	}
}

class Dice{
	char t,s,e,w,n,b;

	Dice(char t,char s,char e,char w,char n,char b){
		this.t = t;
		this.s = s;
		this.e = e;
		this.w = w;
		this.n = n;
		this.b = b;
	}

	Dice move(int d){
		if(d == 0) return new Dice(s,b,e,w,t,n);
		if(d == 1) return new Dice(w,s,t,b,n,e);
		if(d == 2) return new Dice(t,e,n,s,w,b);
		return null;
	}

	Dice getDice(char ch,int dir){
		ch = ch >= 'a' ? (char)(ch-32) : (char)(ch+32);
		Dice d = new Dice(t,s,e,w,n,b);

		for(int i=0;i<2;i++){
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					if(dir == 0 && d.t == ch || dir == 1 && d.s == ch ||
						 dir == 2 && d.e == ch || dir == 3 && d.w == ch ||
						 dir == 4 && d.n == ch || dir == 5 && d.b == ch) return d;
					d = d.move(0);
				}
				d = d.move(1);
			}
			d = d.move(2);
			if(i==1) d = d.move(2);
		}

		return null;
	}

	Dice copy(){
		return new Dice(t,s,e,w,n,b);
	}

	public String toString(){
		return String.format("[%c%c%c%c%c%c]",t,s,e,w,n,b);
	}
}