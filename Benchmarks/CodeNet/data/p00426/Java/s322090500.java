import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			int[] a = new int[n+1];
			int[] b = new int[n+1];
			int[] c = new int[n+1];
			int[] d = new int[n+1];
			int[] e = new int[n+1];
			int[] f = new int[n+1];
			
			int an = 0, bn = 0, cn = 0, dn = 0, en = 0, fn = 0;
			
			dn = sc.nextInt();
			for(int i=1;i<=dn;i++) d[i] = sc.nextInt();
			en = sc.nextInt();
			for(int i=1;i<=en;i++) e[i] = sc.nextInt();
			fn = sc.nextInt();
			for(int i=1;i<=fn;i++) f[i] = sc.nextInt();
			
			int ans = Integer.MAX_VALUE;
			int[] ini = new int[2];
			int com;
			
			if(d[dn]>e[en] && e[en]>f[fn]){
				ini[0] = 0;
				ini[1] = 2;
			}else if(d[dn]>e[en] && e[en]<f[fn]){
				ini[0] = 0;
				ini[1] = 3;
			}else if(d[dn]<e[en] && e[en]<f[fn]){
				ini[0] = 1;
				ini[1] = 3;
			}
			
			for(int k=0;k<2;k++){
				com = ini[k];
				for(int i=0;i<=n;i++){
					a[i] = d[i];
					b[i] = e[i];
					c[i] = f[i];
				}
				an = dn;
				bn = en;
				cn = fn;
				for(int i=0;i<=m;i++){
					if(bn==0 && (an==0 || cn==0)){
						ans = Math.min(ans, i);
						break;
					}
					
					if(com==0){
						bn++;
						b[bn] = a[an];
						an--;
						if(b[bn]>c[cn]) com = 2;
						else com = 3;
					}else if(com==1){
						an++;
						a[an] = b[bn];
						bn--;
						if(b[bn]>c[cn]) com = 2;
						else com = 3;
					}else if(com==2){
						cn++;
						c[cn] = b[bn];
						bn--;
						if(a[an]>b[bn]) com = 0;
						else com = 1;
					}else if(com==3){
						bn++;
						b[bn] = c[cn];
						cn--;
						if(a[an]>b[bn]) com = 0;
						else com = 1;
					}
				}
			}
			
			if(ans==Integer.MAX_VALUE) System.out.println(-1);
			else System.out.println(ans);
		}	
	}	
}