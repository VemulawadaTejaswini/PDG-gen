import java.util.*;
import java.lang.StringBuilder;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int c = 0;
		String[] st = sc.nextLine().split(" ");
		int h = Integer.parseInt(st[0]);
		int w = Integer.parseInt(st[1]);
		int[] t = new int[h];
		int[][] n = new int [h][w];
		for(int i = 0;i < h;i++){
			st = sc.nextLine().split(" ");
			for(int k = 0;k < w;k++){
				n[i][k] = Integer.parseInt(st[k]);
			}
		}
		for(int i = 0;i < h;i++){
			for(int k = 0;k < w;k++){
				sb.append(n[i][k]+" ");
				t[i] = c += n[i][k];
			}
			sb.append(c+"\n");
			t[i] = c;
			c = 0;
		}
		for(int i = 0;i < w;i++){
			for(int k = 0;k < h;k++){
				c += n[k][i];
			}
			sb.append(c+" ");
			c = 0;
		}
		for(int i = 0;i < h;i++){
			c += t[i];
		}
		sb.append(c);
		System.out.println(sb);
	}
}