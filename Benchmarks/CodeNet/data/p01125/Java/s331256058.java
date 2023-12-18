import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();

		while(sc.hasNextInt()){
			int value = sc.nextInt();
			if(value != 0){
				calc(value);
			}
			else{
				break;
			}
		}
	}
	public void calc(int N){
		int[][] map = new int[21][21];
		for(int i = 0; i < 21; i++){
			for(int j = 0; j < 21; j++){
				map[i][j] = 0;
			}
		}
		for(int i = 0; i < N; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			map[x][y] = 1;
		}
		int M = sc.nextInt();
		int x = 10;
		int y = 10;
		map[10][10] = 0;
		for(int i = 0; i < M; i ++){
			String d = sc.next();
			int l = sc.nextInt();
			if(d.equals("N")){
				for(int j = 0; j < l; j++){
					y = y + 1;
					map[x][y] = 0;
				}
			}
			else if(d.equals("E")){
				for(int j = 0; j < l; j++){
					x = x + 1;
					map[x][y] = 0;
				}
			}
			else if(d.equals("S")){
				for(int j = 0; j < l; j++){
					y = y - 1;
					map[x][y] = 0;
				}
			}
			else if(d.equals("W")){
				for(int j = 0; j < l; j++){
					x = x - 1;
					map[x][y] = 0;
				}
			}
		}
		check(map);
	}
	public void check(int[][] map){
		boolean ans = true;
		for(int i = 0; i < 21; i++){
			for(int j = 0; j < 21; j++){
				if(map[i][j] == 1){
					ans = false;
					break;
				}
			}
		}
		if(ans){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
	public static void main(String[] args){
		new Main().run();
	}
}