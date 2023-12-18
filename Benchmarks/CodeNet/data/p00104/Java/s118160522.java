import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj0104().doIt();
	}
	class aoj0104{
		int map[][];
		char ctr[] = {'>','<','^','v','.'};
		int xm[] = {1,-1,0,0};
		int ym[] = {0,0,-1,1};
		String ans = "";
		String dfs(int y,int x){
			if(map[y][x] == 4)ans = x+" "+y;
			else if(map[y][x] == -1)ans = "LOOP";
			for(int i = 0;i < 4;i++){
				if(map[y][x] == i){
					map[y][x] = -1;
					dfs(y+ym[i],x+xm[i]);
				}
			}
			return ans;
		}
		void doIt() {
			while(true){
				int y = sc.nextInt();
				int x = sc.nextInt();
				if(y + x == 0)break;
				map = new int [y][x];
				for(int i = 0;i < y;i++){
					String str = sc.next();
					char[] c = str.toCharArray();
					for(int j = 0;j < x;j++){
						for(int k = 0;k < 5;k++){
							if(c[j] == ctr[k])map[i][j] = k;
						}
					}
				}
				System.out.println(dfs(0,0));
			}
		}
	}
}