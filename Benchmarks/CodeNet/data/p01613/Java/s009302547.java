import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] g = new int[4];
		int[][] map;
		int min = 10000000;
		int count = 0;
		int xa = 0;
		int xb = 0;
		int xc = 0;
		int xd = 0;
		int ya = 0;
		int yb = 0;
		int yc = 0;
		int yd = 0;
		for(int i=0;i<4;i++) g[i] = sc.nextInt();
		for(int i=1;i<=n;i++){
			map = new int[n][n];
			count = 1;
			for(int j=0;j<=n-i;j++){
				for(int k=0;k<i;k++){
					map[j][k] = count;
					if(count==g[0]){
						xa = k;
						ya = j;
					}else if(count==g[1]){
						xb = k;
						yb = j;
					}else if(count==g[2]){
						xc = k;
						yc = j;
					}else if(count==g[3]){
						xd = k;
						yd = j;
					}
					count++;
				}
			}
			
			min = Math.min(min, Math.abs(xb-xa)+Math.abs(xd-xc)+Math.abs(yb-ya)+Math.abs(yd-yc));

		}
		System.out.println(min);
	}	
}