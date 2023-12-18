import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] c = new int[3][3];
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				c[i][j] = sc.nextInt();
			}
		}
		for(int i = -100 ; i <= 100 ; i++) {
			for(int j = -100 ; j <= 100 ; j++) {
				for(int k = -100 ; k <= 100 ; k++) {
					int[] b = new int[3];
					b[0] = c[0][0] - i;
					b[1] = c[1][1] - j;
					b[2] = c[2][2] - k;
					if(i + b[0] == c[0][0] && i + b[1] == c[0][1] && i + b[2] == c[0][2] && j + b[0] == c[1][0] && j + b[1] == c[1][1] && j + b[2] == c[1][2] && k + b[0] == c[2][0] && k + b[1] == c[2][1] && k + b[2] == c[2][2]) {
						System.out.println("Yes");
						return;
					}
				}
			}
		}
		System.out.println("No");
	}
}
