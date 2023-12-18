import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main { //atcoder ABC128D -

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		char[][] map = new char[H][W];
		for(int i = 0; i < H; i++){
			map[i] = br.readLine().toCharArray();
		}
		int[][] vals = new int[H][W];
		for(int i = 0; i < H; i++){
			int last = -1, tot = 0;
			for(int j = 0; j < W; j++){
				if(map[i][j] == '#'){
					for(int k = last+1; k < j; k++){
						vals[i][k] = tot;
					}
					last = j; tot = 0;
				}
				else{
					tot++;
				}
			}
			for(int k = last+1; k < W; k++){
				vals[i][k] = tot;
			}
		}
		for(int j = 0; j < W; j++){
			int last = -1, tot = 0;
			for(int i = 0; i < H; i++){
				if(map[i][j] == '#'){
					for(int k = last+1; k < i; k++){
						vals[k][j] += tot;
					}
					last = i; tot = 0;
				}
				else{
					tot++;
				}
			}
			for(int k = last+1; k < H; k++){
				vals[k][j] += tot;
			}
		}
		int max = 0;
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				max = Integer.max(max, vals[i][j]-1);
			}
		}
		System.out.println(max);
	}
}
