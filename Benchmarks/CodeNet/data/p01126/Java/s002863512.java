
import java.util.Scanner;
								
public class Main{
			static void go(boolean[][][] a,int now,int high) {
				int b = now;
				if(high==0)System.out.println(b);
				else
					for(int i=high;i>0;i--) {
						if(a[i][now][now-1])
							go(a,now-1,i-1);
						else if(a[i][now][now+1])
							go(a,now+1,i-1);
					}
			}
			
			public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				int a = sc.nextInt();
				if(n+m+a==0)break;
				
				int high = 0;
				boolean[][][]  amida = new boolean[1001][n+1][n+1];
				for(int i=1;i<=m;i++) {
					int h = sc.nextInt();
					high = Math.max(h, high);
					int p = sc.nextInt();
					int q = sc.nextInt();
					amida[h][p][q] = amida[h][q][p] =true;
				}
				
				int now = a;
				go(amida,now,high);
			}
			
	}
}

