import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
		int m = sc.nextInt();
		// 文字列の入力
		int[] a = new int[m];
		int[] b = new int[m];
		int c = 0;
		for(int i = 0; i < m; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			if(a[i] > b[i]){
				c = a[i] ;
				a[i] = b[i] ;
				b[i] = c;
			}
          a[i]--;
          b[i]--;
          //System.out.println(a[i]);
          //System.out.println(b[i]);
		}
		boolean[][] e = new boolean[n][n];
		for(int i = 0;i < n;i++){
			e[i][i] = true;
		}
		for(int i = 0;i < m;i++){
			e[a[i]][b[i]] = true;
		}
		boolean h = false;
		for(int i = 0;i < n - 1;i++){
			h = true;
			for(int j = 0;j < i;j++){
				if(e[j][i]){
					h = false;
				}
			}
			if(h){
				for(int k = i + 1;k < n;k++){
					for(int j = 0 ;j < i;j++){
						if(e[j][i] && e[j][k]){
							e[i][k] = true;
						}
					}
				}
				
			}
		}
			boolean[] x = new boolean[n];
			for(int i = 0; i < n; i++){
				x[i] = true;
			}
			int f = 0;
			int g = 0; 
			for(int i = 0; i < n; i++){
				if(x[i]){
					for(int j = i + 1; j < n;j++){
						if(e[i][j]){
							x[j] = false;
							f++;
                          //System.out.println(0);
						}
					}
					if(g < f){
						g = f;
					}
					f = 0;
				}
				
			}
			System.out.println(g + 1);
		
		
	}
}