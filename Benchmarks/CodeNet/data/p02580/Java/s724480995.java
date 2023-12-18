import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int H = Integer.parseInt(strs[0]);
		int W = Integer.parseInt(strs[1]);
		int M = Integer.parseInt(strs[2]);
		int[][] map = new int[H][W];
		for(int i = 0 ; i < H ; i++){
			for(int j = 0 ; j < W ; j++){
				map[i][j] = 0;
			}
		}
		for(int i = 0 ; i < M ; i++){
			strs = br.readLine().split(" ");
			int x = Integer.parseInt(strs[0])-1;
			int y = Integer.parseInt(strs[1])-1;
			
			for(int j = 0 ; j < H ; j++){
				map[j][y]++;
			}
			for(int j = 0 ; j < W ; j++){
				if(j == y)continue;
				map[x][j]++;
			}
		}
		
		int max = 0;
		for(int[] line : map){
			for(int n : line){
				if(max < n){
					max = n;
				}
			}
		}
		System.out.println(max);
	}
}
