import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char [][] ch = new char[H][W];
		for (int i=0;i<H;i++) {
			String temp = sc.next();
			for (int j=0;j<W;j++) {
				ch[i][j] = temp.charAt(j);
			}
		}
		int up =-1;
		int down = 1;
		int left = -1;
		int right =1;
		for (int i=0;i<H;i++) {
			for (int j=0;j<W;j++) {
				if (ch[i][j]=='#') {
					if (i+up>=0) {
						if (ch[i+up][j]=='#') {
							continue;
						}
					}
					if (i+down<H) {
						if (ch[i+down][j]=='#') {
							continue;
						}
					}
					if (j+left>=0) {
						if (ch[i][j+left]=='#') {
							continue;
						}
					}
					if (j+right<W) {
						if (ch[i][j+right]=='#') {
							continue;
						}
					}
					System.out.println("No");
					return ;
				}
			}
		}
		System.out.println("Yes");
	}
}