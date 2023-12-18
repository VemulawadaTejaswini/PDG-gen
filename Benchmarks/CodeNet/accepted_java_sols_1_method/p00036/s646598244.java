import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int[][] m = new int[20][20];
			for(int i = 0; i < 8; i++) {
				String s = sc.next();
				for(int j = 0; j < 8; j++) {
					char c = s.charAt(j);
					if(c == '1') {
						m[i+1][j+1] = 1;
					}
				}
			}
			String ans = "";
			loop: for(int i = 1; i < 9; i++) {
				for(int j = 1; j < 9; j++) {
					if(m[i][j]*m[i][j+1]*m[i+1][j]*m[i+1][j+1] == 1) {
						ans = "A";
						break loop;
					}
					if(m[i][j]*m[i+1][j]*m[i+2][j]*m[i+3][j] == 1) {
						ans = "B";
						break loop;
					}
					if(m[i][j]*m[i][j+1]*m[i][j+2]*m[i][j+3] == 1) {
						ans = "C";
						break loop;
					}
					if(m[i][j]*m[i+1][j-1]*m[i+1][j]*m[i+2][j-1] == 1) {
						ans = "D";
						break loop;
					}
					if(m[i][j]*m[i][j+1]*m[i+1][j+1]*m[i+1][j+2] == 1) {
						ans = "E";
						break loop;
					}
					if(m[i][j]*m[i+1][j]*m[i+1][j+1]*m[i+2][j+1] == 1) {
						ans = "F";
						break loop;
					}
					if(m[i][j]*m[i][j+1]*m[i+1][j-1]*m[i+1][j] == 1) {
						ans = "G";
						break loop;
					}
				}
			}
			System.out.println(ans);
		}
		sc.close();
	}
}
