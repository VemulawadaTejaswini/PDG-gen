import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Bicycle Diet
public class Main{

	static class E{
		int s, t, c;
		public E(int s, int t, int c) {
			this.s = s;
			this.t = t;
			this.c = c;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int k = sc.nextInt();
			int d = sc.nextInt();
			if((m|n|k|d)==0)break;
			int[] cake = new int[m];
			for(int i=0;i<m;i++)cake[i]=sc.nextInt();
			List<E> l = new ArrayList<E>();
			while(d--!=0){
				int s, t;
				char[] c = sc.next().toCharArray();
				if(c[0]=='H')s = n+m;
				else if(c[0]=='D')s = n+m+1;
				else if(c[0]=='C')s = c[1]-'0'-1;
				else s = c[1]-'0'-1+m;
				c = sc.next().toCharArray();
				if(c[0]=='H')t = n+m;
				else if(c[0]=='D')t = n+m+1;
				else if(c[0]=='C')t = c[1]-'0'-1;
				else t = c[1]-'0'-1+m;
				int cos = sc.nextInt()*k;
				l.add(new E(s, t, cos));
				l.add(new E(t, s, cos));
			}
			int[][] dp = new int[1<<m][n+m+2];
			for(int[] p:dp)Arrays.fill(p, 1<<28);
			dp[0][n+m] = 0;
			boolean[][] u = new boolean[1<<m][n+m+2];
			u[0][n+m] = true;
			boolean update = true;
			while(update){
				update = false;
				boolean[][] next = new boolean[1<<m][n+m+2];
				for(int i=0;i<(1<<m);i++){
					for(E e:l){
						if(!u[i][e.s])continue;
						if(e.t<m){
							if((i&(1<<e.t))>0)continue;
							int v = dp[i][e.s]+e.c-cake[e.t];
							if(v<dp[i+(1<<e.t)][e.t]){
								update = true;
								next[i+(1<<e.t)][e.t] = true;
								dp[i+(1<<e.t)][e.t] = v;
							}
						}
						else{
							int v = dp[i][e.s]+e.c;
							if(v<dp[i][e.t]){
								update = true;
								next[i][e.t] = true;
								dp[i][e.t] = v;
							}
						}
					}
				}
				u = next;
			}
			int min = 1<<28;
			for(int i=0;i<(1<<m);i++)min=Math.min(min, dp[i][n+m+1]);
			System.out.println(min);
		}
	}
}