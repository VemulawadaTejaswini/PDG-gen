import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		int [][]a = new int[r][c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		scan.close();
		int k = 0;
		for(int i = 0; i < r; i++) {
			int sum = 0;
			for(int j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");
				sum += a[i][j];
			}
			k += sum;
			System.out.println(sum);
		}
		for(int j = 0; j < c; j++) {
			int sum = 0;
			for(int i = 0; i < r; i++) {
				sum += a[i][j];
			}
			if(j == c - 1) {
				System.out.println(sum + " " + k);
			}else {
				System.out.print(sum + " ");
			}
		}
	}
}
