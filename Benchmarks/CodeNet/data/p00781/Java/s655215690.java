import java.util.*;
public class Main {
	int [][] map;
	int ans;
	String [][] boards;
	boolean isused [];

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			String inputline = sc.nextLine();
			if(inputline.equals("END")) break;
			boards = new String[2][10];
			boards[0] = inputline.split(" ");
			for(int i = 0; i < 10; i++){
				StringBuilder sb = new StringBuilder(boards[0][i]);
				sb.reverse();
				boards[1][i] = sb.toString();
			}
			map = new int[10][5];
			for(int i = 0; i < 10; i++){
				Arrays.fill(map[i], -1);
			}
			isused = new boolean[10];
			ans = 0;
			dfs(0);
			System.out.println(ans/ 8);
		}
	}

	private void dfs(int deep){
		if(deep == 10){
			ans++;
			return ;
		}
		
		for(int i= 0 ; i < 10; i++){
			if(! isused[i]){
				for(int dir = 0; dir < 2; dir++){
					boolean isarrange = true;
					for(int j = 0; j < 5 ; j++){
						map[deep][j] = boards[dir][i].charAt(j) - '0';
						if(deep < 5){
							int movey = j + 5, movex = 5 - deep - 1;
							if(map[movey][movex] != -1 && map[deep][j] + map[movey][movex] != 1){
								isarrange = false;
							}
						}
						else{
							int movey = deep - 5, movex = 5 - j - 1;
							if(map[movey][movex] != -1 && map[deep][j] + map[movex][movey] != 1){
								isarrange = false;
							}
						}
					}
					isused[i] = true;
					if(isarrange){
						dfs(deep + 1);
					}
					isused[i] = false;
					for(int j = 0; j < 5 ; j++){
						map[deep][j] = -1;
					}
					if(boards[0][i].equals(boards[1][i])){
						break;
					}
				}
				
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}