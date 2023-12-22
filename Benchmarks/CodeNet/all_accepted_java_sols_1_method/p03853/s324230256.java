
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h, w;
		String c[];
		char ans[][];
		
		h = sc.nextInt();
		w = sc.nextInt();
		
		c = new String[h];
		ans = new char[2 * h][w];
		
		for(int i = 0; i < h; ++i) c[i] = sc.next();
		
		for(int i = 0; i < 2 * h; ++i) {
			for(int j = 0; j < w; ++j) {
				ans[i][j] = c[i / 2].charAt(j);
			}
		}
		
		
		for(int i = 0; i < 2 * h; ++i) {
			for(char a : ans[i])System.out.print(a);
			System.out.println();
		}
		
		sc.close();
	}

}
