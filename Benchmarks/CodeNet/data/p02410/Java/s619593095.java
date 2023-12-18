import java.util.*;
import java.lang.StringBuilder;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String[] st = sc.nextLine().split(" ");
		int h = Integer.parseInt(st[0]);
		int w = Integer.parseInt(st[1]);
		int[][] a = new int[h][w];
		int[] b = new int[w];
		int[] c = new int[h];
		for(int i = 0;i < h;i++){
			st = sc.nextLine().split(" ");
			for(int o = 0;o < w;o++){
				a[i][o] = Integer.parseInt(st[o]);
			}
		}
		for(int i = 0;i < w;i++){
			b[i] = sc.nextInt();
		}
		for(int i = 0;i < h;i++){
			for(int o = 0;o < w;o++){
				c[i] += a[i][o] * b[o];
			}
		}
		for(int i:c){
			System.out.println(i);
		}
	}
}