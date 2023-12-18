import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] c = new String[4][4];
		
		String[] x = new String[4];
		
		for(int i = 1; i < 4; i++) {
			x[i] = sc.next();
		}
		
		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 4; j++) {
				char y = x[i].charAt(j - 1);
				c[i][j] = String.valueOf(y);
			}
		}
		String a = c[1][1] + c[2][2] + c[3][3];
		System.out.println(a);
		
	}
}
