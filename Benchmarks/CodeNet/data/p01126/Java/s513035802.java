import java.util.*;

class Main {
	
	static long gh = 100000000000l, gp = 100000, gq = 1;
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt(), m = in.nextInt(), a = in.nextInt();
			if(n==0 && m==0 && a==0) return ;
			long amida[] = new long[m];
			for(int i=0; i<m; i++){
				int h = in.nextInt(), p = in.nextInt(), q = in.nextInt();
				amida[i] = toLong(h, p, q);
			}
			Arrays.sort(amida);
			
			int cur = a, height = 10000;
			for(int i=m-1; i>=0; i--)if(height>getH(amida[i])){
				if(getP(amida[i])==cur){
					cur = getQ(amida[i]);
					height = getH(amida[i]);
				}
				else if(getQ(amida[i])==cur){
					cur = getP(amida[i]);
					height = getH(amida[i]);
				}
			}
			System.out.println(cur);
		}
	}
	
	private static long toLong(int h, int p, int q){
		return gh*h + gp*p + gq*q;
	}
	
	private static int getH(long x){
		return (int)(x/gh);
	}
	
	private static int getP(long x){
		return (int)((x/gp)%gp);
	}
	
	private static int getQ(long x){
		return (int)(x%gp);
	}
}