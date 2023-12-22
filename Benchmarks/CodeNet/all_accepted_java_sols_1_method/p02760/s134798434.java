import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] A = new int[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			int b = sc.nextInt();
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					if(A[j][k] == b)
						A[j][k] = 0;
				}
			}
		}
		boolean ok = false;
		for(int i = 0; i < 3; i++) {
			if(A[i][0] == 0 && A[i][1] == 0 && A[i][2] == 0)
				ok = true;
			if(A[0][i] == 0 && A[1][i] == 0 && A[2][i] == 0)
				ok = true;
		}
		if(A[0][0] == 0 && A[1][1] == 0 && A[2][2] == 0)
			ok = true;
		if(A[2][0] == 0 && A[1][1] == 0 && A[0][2] == 0)
			ok = true;
		System.out.println(ok ? "Yes" : "No");

	}

}