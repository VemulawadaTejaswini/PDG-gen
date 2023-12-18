import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] res = new int[h][w];
		for(int i = 0; i < h; i++){
			int cnt = -1;
			char[] inp = sc.next().toCharArray();
			for(int j = 0; j < w; j++){
				if(inp[j] == 'c') cnt = 0;
				else if(cnt > -1) cnt++;
				res[i][j] = cnt;
			}
		}
		for(int i = 0; i < h;){
			for(int j = 0; j < w; j++){
				if( j != w - 1) System.out.print(res[i][j] + " ");
				else System.out.println(res[i][j]);
			}
		}

	}

}