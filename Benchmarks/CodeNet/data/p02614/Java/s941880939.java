import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		char[][] c = new char[h][w];
		
		int count = 0;
		for(int i = 0; i < h; i++) {
			String s = sc.next();
			for(int j = 0; j < w; j++) {
				c[i][j] = s.charAt(j);
				if(c[i][j] == '#') count++;
			}
		}
		
		int ans = 0;
		
		// bit全探索 縦
		for(int i = 0; i < 1 << h; i++) {
			
			//　bit全探索 横
			for(int j = 0; j < 1 << w; j++) {
				
				int count_temp = 0;
				
				// 縦　h回
				for(int ii = 0; ii < h; ii++) {
					
					// 横　w回
					for(int jj = 0; jj < w; jj++) {
						
						if((i >> ii & 1) == 1) {
							// 赤く塗りつぶすと考える
							continue;
						}
						
						if((j >> jj & 1) == 1) {
							// 赤く塗りつぶすと考える
							continue;
						}
					
						// 塗り潰されなかった全マスのii jj の1つ1つのマスが＃ならインクリメント
						if(c[ii][jj] == '#')count_temp++;	
						
					}
					
				}
				
				// 2^h*w パターンの各々の回で求める#の数ならインクリメント
				if(count_temp == k) ans++;
				
			}
			
		}
		
		System.out.println(ans);
		
	}

}
