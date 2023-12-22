import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] a = new char[h][w];
		for(int i = 0 ; i < h ; i++) a[i] = sc.next().toCharArray();
		int cnt = 0;
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				if(a[i][j] == '#') cnt++;
			}
		}
		if(h + w - 1 == cnt) System.out.println("Possible");
		else System.out.println("Impossible");
	}
}
