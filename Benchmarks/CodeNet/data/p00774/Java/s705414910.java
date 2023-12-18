import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	public void run(){
		while(true){
			int h = sc.nextInt();
			if(h == 0) break;
			calc(h);
		}
	}
	public void calc(int h){
		int[][] board = new int[h][5];
		for(int i = h-1; i >= 0; i--){
			for(int j = 0; j < 5; j++){
				board[i][j] = sc.nextInt();
			}
		}
		int ans = 0;
		while(true){
			int sum = 0;
			for(int i = 0; i < h; i++){
				int count = 0;
				int start = -1;
				int before = 0;
				for(int j = 0; j < 5; j++){
					if(board[i][j] == 0){
						count = 0;
						start = -1;
						before = 0;
					}
					else if(board[i][j] == before){
						count += 1;
						if(j == 4 && count >= 3){
							sum += before*count;
							for(int k = start; k < start+count; k++){
								board[i][k] = 0;
							}
						}
					}
					else {
						if(count >= 3){
							sum += before*count;
							for(int k = start; k < start+count; k++){
								board[i][k] = 0;
							}
						}
						count = 1;
						start = j;
						before = board[i][j];
					}
					
				}
			}
			
			if(sum == 0) break;
			else ans += sum;
			
			for(int j = 0; j < 5; j++){
				int counter = 0;
				for(int i = 0; i < h; i++){
					if(board[i][j] == 0){
						counter++;
					}
					else if(counter > 0){
						board[i-counter][j] = board[i][j];
						board[i][j] = 0;
					}
				}
			}
		}
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
}