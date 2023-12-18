import java.util.*;
public class Main {
	int [][] ver, hor;
	int ans;
	String [][] boards;
	
	int [] debug;

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
			ver = new int[5][5];
			hor = new int[5][5];
			for(int i = 0; i < 5; i++){
				Arrays.fill(ver[i], -1);
				Arrays.fill(hor[i], -1);
			}
			
			//debug
			debug = new int[10];
			Arrays.fill(debug, -1);
			
			ans = 0;
			dfs(0);
			System.out.println(ans/ 8);
		}
	}
	
	private void disp(){
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j ++){
				System.out.print(hor[i][j]);
			}
			System.out.print(" ");
			for(int j = 0; j < 5; j++){
				System.out.print(ver[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i= 0; i < 10; i++){
			System.out.print(debug[i] + " ");
		}
		System.out.println();
	}
	
	private void dfs(int deep){
		if(deep == 10){
			ans++;
			//disp();
			return ;
		}
		//hor
		for(int i = 0; i < 5; i++){
			if(hor[i][0] == -1){
				for(int dir = 0; dir < 2; dir++){
					boolean isarrange = true;
					for(int j = 0; j < 5; j++){
						hor[i][j] = boards[dir][deep].charAt(j) - '0';
						if(ver[i][j] != -1 && ver[i][j] + hor[i][j] != 1){
							isarrange = false;
						}
					}
					if(isarrange){
						debug[i] = deep;
						dfs(deep + 1);
						debug[i] = -1;
					}
					for(int j = 0; j < 5; j++){
						hor[i][j] = -1;
					}
					if(boards[0][deep].equals(boards[1][deep])){
						break;
					}
				}
			}
		}
		//ver
		for(int i = 0; i < 5; i++){
			if(ver[0][i] == -1){
				for(int dir = 0; dir < 2; dir++){
					boolean isarrange = true;
					for(int j = 0; j < 5; j++){
						ver[j][i] = boards[dir][deep].charAt(j) - '0';
						if(hor[j][i] != -1 && ver[j][i] + hor[j][i] != 1){
							isarrange = false;
						}
					}
					if(isarrange){
						debug[i+5] = deep;
						dfs(deep + 1);
						debug[i+5] = -1;
					}
					for(int j = 0; j < 5; j++){
						ver[j][i] = -1;
					}
					if(boards[0][deep].equals(boards[1][deep])){
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