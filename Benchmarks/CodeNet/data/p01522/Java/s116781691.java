import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[][] map = new int[k][n+1];
		int p = 0;
		
		for(int i=0;i<k;i++){
			p = sc.nextInt();
			for(int j=0;j<p;j++){
				map[i][sc.nextInt()]++;
			}
		}
		
		int m = sc.nextInt();
		int a, b;
		int[] ans = new int[n+1];
		
		for(int i=0;i<m;i++){
			a = sc.nextInt();
			b = sc.nextInt();
			for(int j=0;j<k;j++){
				if(map[j][a]>0 && map[j][b]>0){
					ans[a]++;
					ans[b]++;
					break;
				}
			}
		}
		
		int count = 0;
		for(int i=0;i<n+1;i++){
			if(ans[i]>0) count++;
		}
		
		System.out.println(count);
	}	
}