import java.util.*;
	
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(), w = sc.nextInt();
		int n = sc.nextInt();
		int a[] = new int[n+1];
		
		int g[][] = new int[h][w];
		
		for(int i= 1;i<=n;i++){
			a[i] = sc.nextInt();
		}
		
		int p=1;
		int r = 0, c = 0;
		int dir = 1;
		while(p<=n){
			while(p<=n && c<w){
				g[r][c] = p;
				c++;
				a[p]--;
				if(a[p]==0)
					p++;
			}
			r++;
			c--;
			while(p<=n && c>=0){
				g[r][c] = p;
				c--;
				a[p]--;
				if(a[p]==0)
					p++;
			}
			r++;
			c++;
		}
		
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				System.out.print(g[i][j]+" ");
			}
			System.out.println();
		}
	}

}
