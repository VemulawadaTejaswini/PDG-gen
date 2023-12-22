
import java.util.Scanner;

public class Main {
	
	static int h,w,n;
	static int []a;
	static int [][]  grid;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 h = Integer.parseInt(sc.next());
		 w = Integer.parseInt(sc.next());
		
		 n = Integer.parseInt(sc.next());
		
		 a = new int [n+1];
		
		for(int i = 1 ;i <= n ;i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		grid = new int [h][w];
		int x = 0; int num = 1;
		int cnt = 0;
		while(grid[h-1][w-1] == 0) {
			if(x % 2 == 0) {
				for(int i = 0 ;i < h ; i++) {
					grid[i][x] = num;
					cnt++;
					if(cnt == a[num]) {
						num++;
						cnt = 0;
					}
				}
				x++;
			}
			else {
				for(int i = h-1 ; i >= 0 ;i--) {
					grid[i][x] = num;
					cnt++;
					if(cnt == a[num]) {
						num++;
						cnt = 0;
					}
				}
				x++;
			}
		}
		for(int i = 0 ;i < h ; i++) {
			for(int j = 0 ; j < w-1 ; j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.print(grid[i][w-1]);
			System.out.println();
		}
	}	
}
