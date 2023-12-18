import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

class Main{
	static int w,h;
	static String [][]map;
	public static void main(String[] args){
		Main app = new Main();
		Scanner sc = new Scanner(System.in);
		while(true){
			int count = 0;
			h = sc.nextInt();
			w = sc.nextInt();
			if((w | h) == 0)break;
			map = new String[h + 10][w + 10];
			for(int i = 0; i < h; i++){
				char temp []= sc.next().toCharArray();
				for(int j = 0; j < w; j++){
					map[i][j] = String.valueOf(temp[j]);
				}
			}
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(!map[i][j].equals("N")){
						app.solve(i,j,map[i][j]);
						count++;
					}
				}
			}
			System.out.println(count);
		}

	}
	void solve(int i, int j, String temp){
		if(map[i][j].equals(temp)){
			map[i][j] = "N";
			if(judge(i + 1,j)){
				solve(i + 1, j,temp);
			}
			if(judge(i - 1,j)){
				solve(i - 1, j,temp);
			}
			if(judge(i,j + 1)){
				solve(i, j + 1,temp);
			}
			if(judge(i,j - 1)){
				solve(i, j - 1,temp);
			}
		}
	}
	boolean judge(int x,int y){
		if(x < 0 || x >= h || y < 0 || y >= w)return false;
		else return true;
	}
}