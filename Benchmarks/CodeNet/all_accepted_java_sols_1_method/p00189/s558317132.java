
import java.io.*;
import java.util.*;
public class Main{
	static int n;
	static final int INF = 999999999;
	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(System.in);
		
		while(true){
			n = s.nextInt();
			if(n==0) break;
			
			int field[][] = new int[10][10];
			for(int i = 0; i < 10; i++){
				for(int j = 0; j < 10; j++){
					if(i!=j)
						field[i][j] = INF;
				}
			}
			int maxid = 0;
			for(int i = 0; i < n; i++){
				int x = s.nextInt();
				int y = s.nextInt();
				int c = s.nextInt();
				field[x][y] = field[y][x] = c;
				maxid = Math.max(maxid, Math.max(x, y));
			}
			
			
			for(int i = 0; i <= maxid; i++)
				for(int j = 0; j <= maxid; j++)
					for(int k = 0; k <= maxid; k++)
						field[j][k] = Math.min(field[j][k], field[j][i]+field[i][k]);
			
			int min = INF;
			int minid = 0;
			for(int i = 0; i <= maxid; i++){
				int temp = 0;
				for(int j = 0; j <= maxid; j++){
					temp += field[i][j];
				}
				if(min > temp){
					min = temp;
					minid = i;
				}
			}
			System.out.println(minid+" "+min);
		}
	}
}