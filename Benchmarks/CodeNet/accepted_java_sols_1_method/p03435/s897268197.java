import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int[] x = new int[3];
		int[] y = new int[3];
		x[0] = 0;
		for(int i = 0 ; i < 3 ; i++) {
			y[i] = a[0][i] - x[0];
		}
		for(int i = 0 ; i < 3 ; i++) {
			x[i] = a[i][0] - y[0];
		}
		boolean ok = true;
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				if(a[i][j] != x[i] + y[j]) ok = false;
			}
		}
		if(ok) System.out.println("Yes");
		else System.out.println("No");
	}
}
