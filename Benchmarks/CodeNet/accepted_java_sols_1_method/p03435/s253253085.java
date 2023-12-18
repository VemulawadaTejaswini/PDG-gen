import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] C = new int[3][3];
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3;j++) {
				C[i][j] = Integer.parseInt(sc.next());
			}
		}
		sc.close();
		int[] a = new int[3];
		int[] b = new int[3];
		a[0] = 0;
		b[0] = C[0][0];
		b[1] = C[0][1];
		b[2] = C[0][2];
		a[1] = C[1][0] - b[0];
		a[2] = C[2][0] - b[0];
		String ans = "Yes";
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3;j++) {
				if(a[i] + b[j] != C[i][j]) {
					ans = "No";
				}
			}
		}
		System.out.println(ans);
	}
}