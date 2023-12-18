import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int H = Integer.parseInt(in.next());
		int W = Integer.parseInt(in.next());
		int[][] c = new int[10][10];
		for(int x = 0; x <= 9; x++){
			for(int y = 0; y <= 9; y++){
				c[x][y] = Integer.parseInt(in.next());
			}
		}
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				for(int k = 0; k < 10; k++){
					c[j][k] = Math.min(c[j][k],c[j][i] + c[i][k]);
				}
			}
		}
		int ans = 0;
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				int tmp = Integer.parseInt(in.next());
				if(tmp != -1&&tmp != 1)ans += c[tmp][1];
			}
		}

		System.out.println(ans);
	}
}