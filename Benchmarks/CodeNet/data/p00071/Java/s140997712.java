import java.util.Scanner;
public class Main{
	static char[][] m;
	static int[][] moving = {{0,1},{0,-1},{1,0},{-1,0}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 1;
		int ss = sc.nextInt();
		while(ss--!=0){
			m = new char[8][8];
			for(int i = 0; i < 8; i++)m[i] = sc.next().toCharArray();
			int j = sc.nextInt()-1;
			int i = sc.nextInt()-1;
			don(i,j);
			System.out.println("Data " + ans++ + ":");
			for(int k = 0;k < 8; k++){
				System.out.println(new String(m[i]));
			}
		}
	}
	static void don(int x, int y){
		m[x][y] = '0';
		for(int i = 0; i < 4 ; i++){
			for(int j = 1 ;j <= 3 ; j++){
				int ni = x + j * moving[i][0];
				int nj = y + j * moving[i][1];
				if(0 <= ni && ni <  8 && 0 <= nj && nj < 8 && m [ni][nj] == '1')don(ni,nj);
			}
		}
	}

	
}