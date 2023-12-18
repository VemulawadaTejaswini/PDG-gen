import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int H, W, K;
		
		H = in.nextInt();
		W = in.nextInt();
		K = in.nextInt();
		
		String[] colors = new String[H];
		int total = 0;
		for(int i = 0; i < H; ++i) { 
			colors[i] = in.next();
			for(int j = 0; j < W; ++j)
				if(colors[i].charAt( j ) == '#') ++total;
		}

		int ans = 0;
		for(int i = 0; i < Math.pow(2, H); ++i) {
			for(int j = 0; j < Math.pow(2,  W); ++j) {
//				System.out.printf("%d %d\n", i, j);
				
				
				boolean[][] mat = new boolean[H][W];
				int cnt = 0;
				for(int row = 0; row < H; ++row) {
					if( (i & (1 << row)) > 0 ) {
						for(int ii = 0; ii < W; ++ii)
							if(colors[row].charAt(ii) == '#') {
								++cnt;
								mat[row][ii] = true;
							}
					}
				}
				
				
				for(int col = 0; col < W; ++col) {
					if( (j & (1 << col)) > 0) {
						for(int ii = 0; ii < H; ++ii) {
							if(mat[ii][col] == false && colors[ii].charAt(col) == '#')
								++cnt;
						}
					}
				}
				
				if(total - cnt == K)
					++ans;
			}
		}
		
		System.out.println(ans);

	}

}
