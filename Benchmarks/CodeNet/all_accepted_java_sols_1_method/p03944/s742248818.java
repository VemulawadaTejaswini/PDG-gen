import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();
		int[][] cood = new int[N][3];
		for(int i = 0;i < N;++i) {
			cood[i][0] = sc.nextInt();
			cood[i][1] = sc.nextInt();
			cood[i][2] = sc.nextInt();
		}
		sc.close();
		
		boolean[][] square = new boolean[W][H];
		for(int x = 0;x < W;++x)
			for(int y = 0;y < H;++y)
				square[x][y] = true;

		for(int i = 0;i < N;++i) {
			switch(cood[i][2]) {
			case 1:
				for(int x = 0;x < cood[i][0];++x)
					for(int y = 0;y < H;++y)
						square[x][y] = false;
				break;
			case 2:
				for(int x = cood[i][0];x < W;++x)
					for(int y = 0;y < H;++y)
						square[x][y] = false;
				break;
			case 3:
				for(int x = 0;x < W;++x)
					for(int y = 0;y < cood[i][1];++y)
						square[x][y] = false;
				break;
			case 4:
				for(int x = 0;x < W;++x)
					for(int y = cood[i][1];y < H;++y)
						square[x][y] = false;
				break;
			}
		}
		int ans = 0;
		for(int x = 0;x < W;++x)
			for(int y = 0;y < H;++y)
				if(square[x][y])
					++ans;
		System.out.println(ans);
	}
}
