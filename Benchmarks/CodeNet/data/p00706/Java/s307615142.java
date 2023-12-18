import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int w = sc.nextInt();
			int h = sc.nextInt();
			int x, y;
			int[][] map = new int[h][w];
			for(int i=0;i<n;i++){
				x = sc.nextInt();
				y = sc.nextInt();
				map[y-1][x-1] = 1;
			}
			int s = sc.nextInt();
			int t = sc.nextInt();
			
			int max = 0;
			int sum;
			for(int i=0;i<=h-t;i++){
				for(int j=0;j<=w-s;j++){
					sum = 0;
					for(int p=0;p<t;p++){
						for(int q=0;q<s;q++) sum+=map[p+i][q+j];
					}
					max = Math.max(max,sum);
				}
			}
			System.out.println(max);
		}	
	}	
}