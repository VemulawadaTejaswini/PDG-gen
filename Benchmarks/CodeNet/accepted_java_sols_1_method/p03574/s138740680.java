import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		String[] S = new String[H];
		for(int i = 0; i < H; i++) {
			S[i] = sc.next();
		}
		
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(S[i].substring(j, j + 1).equals("#")) {
					System.out.print("#");
					continue;
				}
				int cnt = 0;
				for(int a = -1; a <= 1; a++) {
					for(int b = -1; b <= 1; b++) {
						if(a == 0 && b == 0) continue;
						if(i == 0 && a == -1) continue;
						if(i == H - 1&& a == 1) continue;
						if(j == 0 && b == -1) continue;
						if(j == W - 1 && b == 1) continue;
						if(S[i + a].substring(j + b, j + b + 1).equals("#")) {
							cnt++;
						}
					}
				}
				System.out.print(cnt);
			}
			System.out.println();
		}
	}
}
