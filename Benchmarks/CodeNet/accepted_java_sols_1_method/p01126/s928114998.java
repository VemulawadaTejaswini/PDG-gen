import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a = sc.nextInt();
			if(n==0 && m==0 && a==0)break;
			
			int[][] map = new int[1001][n+1];
			int b, c, d;
			for(int i=0;i<m;i++){
				b = sc.nextInt();
				c = sc.nextInt();
				d = sc.nextInt();
				map[b][c] = d;
				map[b][d] = c;
			}
			
			for(int i=1000;i>0;i--){
				if(map[i][a]!=0)a=map[i][a];
			}
			System.out.println(a);
			
		}
	
	}	
}