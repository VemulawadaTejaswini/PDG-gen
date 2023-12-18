import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h==0 && w==0) break;
			int[][] map = new int[h][w];
			
			int wid;
			int max = 0;
			char[] a = new char[w];
			for(int i=0;i<h;i++){
				a = sc.next().toCharArray();
				for(int j=0;j<w;j++){
					wid = 501;
					if(a[j]=='.'){
						if(j==0) map[i][j]=1;
						else map[i][j] = map[i][j-1]+1;
						for(int k=i;k>=0;k--){
							if(map[k][j]==0) break;
							wid = Math.min(wid, map[k][j]);
							max = Math.max(max, wid*(i+1-k));
						}
					}
				}
			}
			System.out.println(max);
		}	
	}	
}