import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		String[][] map = new String[8][8];
		for(int i = 0; i < 8; i++){
			String line = sc.nextLine();
			for(int j = 0; j < 8; j++){
				map[i][j] = line.substring(j, j+1);		
			}
		}
		
		String tomoe = "o";
		String charlotte = "x";
		
		String now = tomoe;
		boolean tomoeC = true;
		String wait = charlotte;
		boolean charlotteC = true;
		while(true){
			int max = 0;
			int maxI = 0;
			int maxJ = 0;
			for(int i = 0; i < 8; i++){
				for(int j = 0; j < 8; j++){
					if(map[i][j].equals(".")){ 
						int c = check(i, j, now, wait, map);
						if(c == max && now.equals(tomoe)){
							if(i < maxI || (i == maxI && j < maxJ)){ 
								maxJ = j; maxI = i;
							}
						}
						else if(c == max && now.equals(charlotte)){
							if(i > maxI || (i == maxI && j > maxJ)){
								maxJ = j; maxI = i;
							}
						}
						else if(c > max){
							max = c;
							maxI = i;
							maxJ = j;
						}
					}
				}
			}
			
			if(!tomoeC && !charlotteC) break;
			if(max == 0) {
				if(now.equals(tomoe)) tomoeC = false;
				else charlotteC = false;
			}
			else{
				map[maxI][maxJ] = now;
				turn(maxI, maxJ, now, wait, map);
			}
			String t = now;
			now = wait;
			wait = t;
		}
		
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				System.out.printf(map[i][j]);
			}
			System.out.println();
		}
	}
	public int check(int i, int j, String now, String wait, String[][] map){
		int sum = 0;
		int[] x = { 0, 1, 1, 1, 0,-1,-1,-1};
		int[] y = {-1,-1, 0, 1, 1, 1, 0,-1};
		
		for(int k = 0; k < 8; k++){
			int nx = i + x[k];
			int ny = j + y[k];
			int s = 0;
			while(nx < 8 && ny < 8 && nx >= 0 && ny >= 0){
				if(map[nx][ny].equals(wait)) 
					s++;
				else if(map[nx][ny].equals(now))
					break;
				else {
					s = 0;
					break;
				}
				nx = nx + x[k];
				ny = ny + y[k];
				if(nx >= 8 || ny >= 8 || nx < 0 || ny < 0) s = 0;
			}
			sum += s;
		}
		return sum;
	}
	public void turn(int i, int j, String now, String wait, String[][] map){
		int[] x = { 0, 1, 1, 1, 0,-1,-1,-1};
		int[] y = {-1,-1, 0, 1, 1, 1, 0,-1};
		
		for(int k = 0; k < 8; k++){
			int nx = i + x[k];
			int ny = j + y[k];
			int s = 0;
			while(nx < 8 && ny < 8 && nx >= 0 && ny >= 0){
				if(map[nx][ny].equals(wait)) 
					s++;
				else if(map[nx][ny].equals(now))
					break;
				else {
					s = 0;
					break;
				}
				nx = nx + x[k];
				ny = ny + y[k];
				if(nx >= 8 || ny >= 8 || nx < 0 || ny < 0) s = 0;
			}
			if(s > 0){
				nx = i + x[k];
				ny = j + y[k];
				for(int t = 0; t < s; t++){
					map[nx][ny] = now;
					nx = nx + x[k];
					ny = ny + y[k];
				}
			}
		}
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}