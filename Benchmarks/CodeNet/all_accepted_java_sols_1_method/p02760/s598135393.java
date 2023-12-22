import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] A = new int[3][3];
		boolean[][] R = new boolean[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				A[i][j] = sc.nextInt();
				R[i][j] = false;
			}
		}
		int N = sc.nextInt();
		boolean r = false;
		for(int b = 0; b < N; b++) {
			int B = sc.nextInt();
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(B == A[i][j]) R[i][j] = true;
				}
				if(R[i][0] && R[i][1] && R[i][2]) {
					r = true;
					break;
				}
			}
		}
		sc.close();
		for(int j = 0; j < 3; j++) {
			if(R[0][j] && R[1][j] && R[2][j]) {
				r = true;
				break;
			}
		}
		if(R[0][0] && R[1][1] && R[2][2]) r = true;
		if(R[0][2] && R[1][1] && R[2][0]) r = true;
		
		System.out.println(r?"Yes":"No");
	}
}
