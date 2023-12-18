
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		
		int [][]co = new int [c][c];
		
		for(int i = 0 ; i < c ;i++) {
			for(int j = 0 ; j < c ;j++) {
				co[i][j] = Integer.parseInt(sc.next());
			}
		}
		
		int [][]grid = new int [n][n];
		
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < n ;j++) {
				grid[i][j] = Integer.parseInt(sc.next())-1;
			}
		}
		int [][]cnt = new int [c][3];
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j <n ;j++) {
				if((i+j)%3 == 0) {
					cnt[grid[i][j]][0]++;
				}
				else if((i+j)%3 == 1) {
					cnt[grid[i][j]][1]++;
				}
				else {
					cnt[grid[i][j]][2]++;
				}
			}
		}
		
		int ans = 1000000000;
		for(int i = 0 ; i < c ; i++) {
			for(int j = 0 ; j < c ; j++) {
				for(int k = 0 ; k < c ; k++) {
					if(i == j || j == k || i == k) {
						continue;
					}
					int temp = 0;
					for(int nx = 0; nx < c ; nx++) {
						temp += co[nx][i]*cnt[nx][0];
						temp += co[nx][j]*cnt[nx][1];
						temp += co[nx][k]*cnt[nx][2];
					}
					
					ans = Math.min(ans,temp);
				}
			}
		}
		System.out.println(ans);
		
		
	}
}
