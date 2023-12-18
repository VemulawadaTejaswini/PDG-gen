import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w, h;
		int x, y;
		int[][] c;
		int answer;
		while(true){
			answer = 0;
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0)
				break;
			else{	
				c = new int[h+2][w+2];
				for(int i = 0; i < h+2; i++){
					for(int j = 0; j < w+2; j++){
						if(i == 0 || i == h+1 || j == 0 || j == w+1)
							c[i][j] = 0;
					}
				} 
				for(int i = 1; i < h+1; i++){
					for(int j = 1; j < w+1; j++){
						c[i][j] = sc.nextInt();
					}
				}
				for(int i = 1; i < h+1; i++){
					for(int j = 1; j < w+1; j++){
						if(c[i][j] == 1){
							search(c, i, j, w, h, 2);
							answer++;
						}
					}
				}
			}
			System.out.println(answer);
		}
	}
	static void search(int[][] c, int x, int y, int w, int h, int num){
		for(int i = x-1; i <= x+1; i++){
			for(int j = y-1; j <= y+1; j++){
				if(c[i][j] == 1){
					c[i][j] = num;
				}
			}
		}
		for(int i = x-1; i <= x+1; i++){
			for(int j = y-1; j <= y+1; j++){
				if(c[i][j] == num && i != x && j != y)
					search(c, i, j, w, h, ++num);
			}
		}
		
	}
}