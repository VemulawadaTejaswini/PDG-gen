import java.util.Scanner;

public class Main {

	boolean[][] map;
	boolean[][] visited;
	final int N = 12;
	int cnt;
	boolean flag;
	boolean start=false;
	
	void Land(int i, int j){
		if(i<0||j<0||i>=N||j>=N||map[i][j]==false||visited[i][j]==true){
			return;
		}
		visited[i][j] = true;
		flag = true;
		Land(i+1,j);
		Land(i,j+1);
		Land(i-1,j);
		Land(i,j-1);
	}
	
	void Search(){
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				flag = false;
				Land(i,j);
				if(flag){
					cnt++;
				}
			}
		}
	}
	
	void run(){
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext()){
			if(start){
				stdIn.nextLine();
			}
			start = true;
			map = new boolean[N][N];
			visited = new boolean[N][N];
			for(int i=0;i<N;i++){
				char[] line = stdIn.nextLine().toCharArray();
				for(int j=0;j<N;j++){
					if(line[j]=='1'){
						map[i][j] = true;
					}
				}
			}
			cnt = 0;
			Search();
			System.out.println(cnt);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}