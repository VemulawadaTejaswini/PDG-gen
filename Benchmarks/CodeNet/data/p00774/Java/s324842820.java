import java.util.*;

public class Main {
	int h, score;
	int[][] map;
	ArrayDeque<Integer> que;
	
	void func(){
		while(true){
			boolean flag = false;
			for(int i=0;i<h;i++){
				if(map[i][0]!=0 && map[i][0]==map[i][1] && map[i][1]==map[i][2]){
					flag = true;
					if(map[i][2]==map[i][3]){
						if(map[i][3]==map[i][4]){
							score += map[i][0]*5;
						}else{
							score += map[i][0]*4;
							map[i][4] = 0;
						}
						map[i][3] = 0;
					}else{
						score += map[i][0]*3;
					}
					map[i][2] = 0;
					map[i][1] = 0;
					map[i][0] = 0;
				}else if(map[i][1]!=0 && map[i][1]==map[i][2] && map[i][2]==map[i][3]){
					flag = true;
					if(map[i][3]==map[i][4]){
						score += map[i][1]*4;
						map[i][4] = 0;
					}else{
						score += map[i][1]*3;
					}
					map[i][3] = 0;
					map[i][2] = 0;
					map[i][1] = 0;
				}else if(map[i][2]!=0 && map[i][2]==map[i][3] && map[i][3]==map[i][4]){
					flag = true;
					score += map[i][2]*3;
					map[i][4] = 0;
					map[i][3] = 0;
					map[i][2] = 0;
				}
			}
			if(!flag) break;
			
			que = new ArrayDeque<Integer>();
			for(int j=0;j<5;j++){
				for(int i=0;i<h;i++){
					if(map[i][j]!=0){
						que.offer(map[i][j]);
						map[i][j] = 0;
					}
				}
				int cnt = 0;
				while(!que.isEmpty()){
					int p = que.pollFirst();
					map[cnt][j] = p;
					cnt++;
				}
			}
		}	
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			h = sc.nextInt();
			if(h==0) break;
			map = new int[h][5];
			for(int i=h-1;i>=0;i--){
				for(int j=0;j<5;j++){
					map[i][j] = sc.nextInt();
				}
			}
			score = 0;
			func();
			System.out.println(score);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}