import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] A = new int[3][3];
		boolean[][] S = new boolean[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int N = sc.nextInt();
		int[] b = new int[N];
		for(int i=0; i<N; i++) {
			b[i] = sc.nextInt();
		}
		int s=0;
		int l=0;
		String f="No";
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				S[i][j] = false;
				for(int k=0; k<N; k++) {
					if(b[k]==A[i][j]) {
						S[i][j] = true;
					}
				}
			}
		}

		for(int i=0; i<3; i++) {
			if(S[i][0] && S[i][1] && S[i][2]) {
				f="Yes";
			}
		}
		for(int i=0; i<3; i++) {
			if(S[0][i] && S[1][i] && S[2][i]) {
				f="Yes";
			}
		}

		if(S[0][0] && S[1][1] && S[2][2]) {
			f="Yes";
		}
		if(S[0][2] && S[1][1] && S[2][0]) {
			f="Yes";
		}

		System.out.println(f);
	}

}