import java.util.Scanner;
								
public class Main{
			public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				int a = sc.nextInt();
				if(n+m+a==0)break;
				int[][] r = new int[1002][n+1];
				while(m--!=0) {
					int h = sc.nextInt();
					int p = sc.nextInt();
					int q =  sc.nextInt();
					r[h][p] = q;
					r[h][q] = p;
				}
				int now = a;
				for(int i=1000;i>0;i--) {
					if(r[i][now]!=0)now = r[i][now];
				}
				System.out.println(now);
			}
			
	}
}

