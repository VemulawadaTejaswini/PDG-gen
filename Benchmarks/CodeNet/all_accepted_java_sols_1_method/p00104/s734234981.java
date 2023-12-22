import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int h = stdIn.nextInt();
			int w = stdIn.nextInt();
			if(h==0&&w==0){
				return;
			}
			char[][] map = new char[h][w];
			boolean[][] visited = new boolean[h][w];
			for(int i=0;i<h;i++){
				map[i] = stdIn.next().toCharArray();
			}			
			int x = 0, y = 0;
			while(true){
				if(visited[x][y]){
					System.out.println("LOOP");
					break;
				}
				visited[x][y] = true;
				if(map[x][y]=='>'){
					y++;
				}
				else if(map[x][y]=='<'){
					y--;
				}
				else if(map[x][y]=='v'){
					x++;
				}
				else if(map[x][y]=='^'){
					x--;
				}
				else if(map[x][y]=='.'){
					System.out.println(y+" "+x);
					break;
				}
			}
		}
	}
}