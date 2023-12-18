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
				int w = sc.nextInt();
				int h = sc.nextInt();
				calc(value,w,h);
			}
			else{
				break;
			}
		}
	}
	public void calc(int n, int w, int h){
		int[][] map = new int[w][h];
		for(int i = 0; i < n; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			map[x-1][y-1] = 1;
		}
		int s = sc.nextInt();
		int t = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < w-s+1; i++){
			for(int j = 0; j < h-t+1; j++){
				int temp = 0;
				for(int a = 0; a < s; a++){
					for(int b = 0; b < t; b++){
						temp = temp + map[i+a][j+b];
					}
				}
				if(temp > ans) ans = temp;
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args){
		new Main().run();
	}
}