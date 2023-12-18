import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	char[][] map;
	int max;
	int n;
	int[] dx = {-1,1,0,0,-1,1,-1,1};
	int[] dy = {0,0,-1,1,-1,-1,1,1};
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			n = scan.nextInt();
			if(n == 0){
				break;
			}
			map = new char[n][];
			max = 0;
			for(int i = 0;i < n;i++){
				map[i] = scan.next().toCharArray();
			}
			for(int i = 0;i < n;i++){
				for(int j = 0;j < n;j++){
					if(map[i][j] == '1'){
						for(int k = 0;k < 8;k++){
							if(i+dy[k] >= 0 && i+dy[k] < n && j + dx[k] >= 0 && j +dx[k] < n){
								checkGrid(i,j,k,1);
							}
						}
						map[i][j] = '0';
					}
				}
			}
			System.out.println(max);
		}
	}
	public void checkGrid(int i,int j,int dir,int count){
		if(i+dy[dir] >= 0 && i+dy[dir] < n && j + dx[dir] >= 0 && j +dx[dir] < n
				&& map[i+dy[dir]][j + dx[dir]] != '0'){
			checkGrid(i+dy[dir],j+dx[dir],dir,count+1);
		}
		max = (max > count)?max:count;
		return;
	}
}