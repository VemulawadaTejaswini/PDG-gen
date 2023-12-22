import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char s[][] =new char[H][W];
		for (int i=0;i<H;i++) {
			String str = sc.next();
			for(int j=0;j<W;j++) {
				s[i][j] = str.charAt(j);
			}
		}
		for (int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if (s[i][j]=='.') {
					int count =0;
					for (int m=-1;m<=1;m++) {
						for (int k=-1;k<=1;k++) {
							if(j+k<0) {
								continue;
							}
							if (j+k>=W) {
								continue;
							}
							if (i+m<0) {
								continue;
							}
							if (i+m>=H) {
								continue;
							}
							if (s[i+m][j+k]=='#') {
								count ++;
							}
						}
					}
					s[i][j] = (char) ('0' + count);
				}
			}
		}
		for (int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				System.out.print(s[i][j]);
			}
			System.out.println();
		}
	}

}
