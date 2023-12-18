import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int [3];
		int b[] = new int [3];
		int c[][] = new int [3][3];
		for ( int i = 0; i < 3; i++) {
			for ( int j= 0;j < 3; j++) {
				c[i][j] = scan.nextInt();
			}
		}

		int temp1 = c[0][1]-c[0][2];
		int temp2 = c[1][1]-c[1][2];
		int temp3 = c[2][1]-c[2][2];

		int temp4 = c[0][0]-c[0][1];
		int temp5 = c[1][0]-c[1][1];
		int temp6 = c[2][0]-c[2][1];

		boolean ans = true;
		if (temp1 != temp2) {
			ans = false;
		}
		if (temp1 != temp3) {
			ans = false;
		}

		if (temp4 != temp5) {
			ans = false;
		}
		if (temp4 != temp6) {
			ans = false;
		}



		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}