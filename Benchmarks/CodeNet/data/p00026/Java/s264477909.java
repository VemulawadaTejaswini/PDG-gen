import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int board[][] = new int[10][10];
		while((str = br.readLine()) != null) {
			String[] nstr = str.split(",");
			int n[] = new int[]{Integer.parseInt(nstr[0]), Integer.parseInt(nstr[1]), Integer.parseInt(nstr[2])};
			
			if(n[2] == 2) {
				for(int i = -1; i <= 1; i++) {
					if(n[0] + i < 0) continue;
					for(int j = -1; j <= 1; j++) {
						if(n[1] + j < 0) continue;
						board[n[0] + i][n[1] + j]++;
					}
				}
			} else {
				for(int i = 0; i < 10; i++) {
					for(int j = 0; j < 10; j++) {
						if(n[2] == 1) {
							if(Math.abs((n[0] - i) + (n[1] - j)) <= 1) {
								board[i][j]++;
							}
						} else {
							if(Math.abs((n[0] - i) + (n[1] - j)) <= 2) {
								board[i][j]++;
							}
						}
					}
				}
			}
		}

		int cnt = 0, max = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(board[i][j] == 0) cnt++;
				if(board[i][j] > max) max = board[i][j];
			}
		}
		System.out.println(cnt);
		System.out.println(max);
	}
}