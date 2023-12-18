import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] m = new int[N][N];
		for(int i=0; i<N; i++) {
			Arrays.fill(m[i], -1);
			int A = sc.nextInt();
			for(int j=0; j<A; j++) {
				int x = sc.nextInt()-1;
				int y = sc.nextInt();
				m[i][x] = y;
			}
		}
		
		for(int i=N; i>0; i--) {
			int comb = (1<<i)-1;
			while(comb<(1<<N)) {
				boolean ok = true;
				for(int j=0; j<N; j++) {
					if((comb&(1<<j))!=0) {
						for(int k=0; k<N; k++) {
							if(m[j][k]==0 && (comb&(1<<k))!=0) {
								ok = false;
								break;
							}
							if(m[j][k]==1 && (comb&(1<<k))==0) {
								ok = false;
								break;
							}
						}
					}
					if(!ok)
						break;
 				}
				
				if(ok) {
					System.out.println(i);
					sc.close();
					return;
				}
			
				int x = comb & -comb;
				int y = comb+x;
				comb = ((comb & ~y)/ x>>1) | y;
			}
		}

		System.out.println(0);
		sc.close();
	}
}
