import java.util.Scanner;


public class Main {
	public static boolean[][] visited;
	public static int[][] map;
	public static void CheckIsland(int a, int b, int w, int h){
		visited[a][b] = true;
		for(int i=-1;i<2;i++){
			for(int k=-1;k<2;k++){
				int a2 = a+i; int b2 = b+k;
				if(a2>=0&&b2>=0&&a2<h&&b2<w&&visited[a2][b2]==false&&map[a2][b2]==1){
					visited[a2][b2] = true;
					CheckIsland(a2,b2,w,h);
				}
			}
		}
		}
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true){
			int numberOfIslands=0;
			int w = in.nextInt();
			int h = in.nextInt();
			if(w==0||h==0) break;
		
			map = new int[h][w];
			visited = new boolean[h][w];
		
			for(int i=0; i<h;i++){
				for(int k=0; k<w;k++){
					map[i][k]= in.nextInt();
					visited[i][k]= false;
				}
			}
			for(int i=0; i<h;i++){
				for(int k=0; k<w;k++){
					if(map[i][k]==1&&visited[i][k]==false){
						numberOfIslands++;
						CheckIsland(i,k,w,h);
					}
				}	
			}
			System.out.println(numberOfIslands);
		}
		in.close();
	}
}