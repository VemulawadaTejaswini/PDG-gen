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
			int an = 0, bn = 0, cn = 0;
			
			an = sc.nextInt();
			for(int i=1;i<=an;i++) a[i] = sc.nextInt();
			bn = sc.nextInt();
			for(int i=1;i<=bn;i++) b[i] = sc.nextInt();
			cn = sc.nextInt();
			for(int i=1;i<=cn;i++) c[i] = sc.nextInt();
			
			boolean flag = false;
			int com = 1;
			
			for(int i=0;i<=m;i++){
				if(bn==0 && (an==0 || cn==0)){
					flag = true;
					System.out.println(i);
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
			if(flag==false) System.out.println(-1);
		}	
	}	
}