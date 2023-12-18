import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] m = new char[h][];
		for(int i=0;i<h;i++) {
			m[i] = sc.next().toCharArray();
		}
		int ans = 0;
		for(int i=1;i<h;i++) {
			LOOP: for(int j=0;j<w;j++) {
				if (m[i][j] != '-') continue;
				if (j > 0 && m[i][j-1] != '-') continue;
				if (j < w - 1 && m[i][j+1] != '-') continue;
				for(int i1=-1;i1<=1;i1++) {
					for(int j1=-1;j1<=1;j1++) {
						int i2 = i + i1;
						int j2 = j + j1;
						if (i2 < 0 || i2 >= h || j2 < 0 || j2 >= w) continue;
						if (m[i2][j2] == 'x') continue LOOP;
					}
				}
				ans++;
			}
		}
		System.out.println(ans);
	}

}