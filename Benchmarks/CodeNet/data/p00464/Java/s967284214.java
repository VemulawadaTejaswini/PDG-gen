import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int h = scan.nextInt();
			int w = scan.nextInt();
			int n = scan.nextInt();
			if(h == 0 && w == 0 && n == 0){
				break;
			}
			int[][] route = new int[h][w];
			for(int i = 0;i < h;i++){
				for(int j = 0;j < w;j++){
					route[i][j] = scan.nextInt();
				}
			}
			int x = 0;
			int y = 0;
			for(int i = 0;i < n;i++){
				x = 0;
				y = 0;
				while(true){
					if(x == h || y == w){
						break;
					}
					if(route[x][y] == 0){
						route[x][y] = 1;
						x += 1;
					}else{
						route[x][y] = 0;
						y += 1;
					}
				}
			}
			System.out.println(x+1 + " " + (y+1));
		}
	}
}