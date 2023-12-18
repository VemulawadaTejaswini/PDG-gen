import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] mat = new int[H][W];
		for(int i = 0;i < H;++i) {
			String cap = sc.next();
			for(int j = 0;j < W;++j) {
				mat[i][j] = ((cap.charAt(j) == '.') ? 0 : 1);
			}
		}
		sc.close();
		for(int i = 0;i < H;++i) {
			boolean flag = true;
			for(int j = 0;j < W;++j)
				if(mat[i][j] == 1)
					flag = false;
			if(flag) {
				for(int j = 0;j < W;++j)
					mat[i][j] = 2;
			}
		}
		for(int i = 0;i < W;++i) {
			boolean flag = true;
			for(int j = 0;j < H;++j)
				if(mat[j][i] == 1)
					flag = false;
			if(flag) {
				for(int j = 0;j < H;++j)
					mat[j][i] = 2;
			}
		}
		
		for(int i = 0;i < H;++i) {
			boolean flag = false;
			for(int j = 0;j < W;++j) {
				if(mat[i][j] == 0) {
					System.out.print('.');
					flag = true;
				}else if(mat[i][j] == 1) {
					System.out.print('#');
					flag = true;
				}
			}
			if(flag)
				System.out.println();
		}
	}
}
