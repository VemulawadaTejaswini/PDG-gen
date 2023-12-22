import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[][] a = new int[9][9];

		int i,j;
		for(i = 1; i <= 9; i++) {
			for(j = 1; j <= 9; j++) {
				a[i - 1][j - 1] = i * j;
			}
		}

		int n = scan.nextInt();

		for(i = 0; i < 9; i++) {
			for(j = 0; j < 9; j++) {
				if(a[i][j] == n) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}