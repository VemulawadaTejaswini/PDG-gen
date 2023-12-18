import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int[][] A = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int N = sc.nextInt();
		for (int k = 0; k < N; k++) {
			int x = sc.nextInt();
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (A[i][j] == x) {
						A[i][j] = 0;
					}
				}
			}
		}
		boolean a = (A[0][0] + A[0][1] + A[0][2] == 0);
		boolean b = (A[1][0] + A[1][1] + A[1][2] == 0);
		boolean c = (A[2][0] + A[2][1] + A[2][2] == 0);
		boolean d = (A[0][0] + A[1][0] + A[2][0] == 0);
		boolean e = (A[0][1] + A[1][1] + A[2][1] == 0);
		boolean f = (A[0][2] + A[1][2] + A[2][2] == 0);
		boolean g = (A[0][0] + A[1][1] + A[2][2] == 0);
		boolean h = (A[0][2] + A[1][1] + A[2][0] == 0);
		if (a || b || c || d || e || f || g || h) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}