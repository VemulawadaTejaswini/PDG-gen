
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		int px = 0, py = 0;
		int g[][] = { { 1, 3, 5, 7, 8, 10, 12}, { 4, 6, 9, 11, 0, 0, 0}, { 2, 0, 0, 0, 0, 0, 0}};
		for(int i = 0; i < 3; ++i) {
			for(int j = 0; j < 7; ++j) {
				if(x == g[i][j])px = i;
				if(y == g[i][j])py = i;
			}
		}
		
		if(px == py)System.out.println("Yes");
		else System.out.println("No");
	}
}
