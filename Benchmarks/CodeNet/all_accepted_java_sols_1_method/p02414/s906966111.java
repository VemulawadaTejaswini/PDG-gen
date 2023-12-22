import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		try {
			String buffer[] = br.readLine().split("\\s+");

			int N = Integer.parseInt(buffer[0]);
			int M = Integer.parseInt(buffer[1]);
			int L = Integer.parseInt(buffer[2]);

			int A[][] = new int[N][M];
			int B[][] = new int[M][L];

			String buf_A[] = new String[M];
			String buf_B[] = new String[L];

			for(int row = 0; row < N; row++){
				buf_A = br.readLine().split("\\s+");
				for(int col = 0; col < M; col++){
					A[row][col] = Integer.parseInt(buf_A[col]);
				}
			}

			for(int row = 0; row < M; row++){
				buf_B = br.readLine().split("\\s+");
				for(int col = 0; col < L; col++){
					B[row][col] = Integer.parseInt(buf_B[col]);
				}
			}

			Long ans;

			for(int A_row = 0; A_row < N; A_row++){
				for(int B_col = 0; B_col < L; B_col++){
					ans = 0L;
					for(int B_row = 0; B_row < M; B_row++){
						ans += A[A_row][B_row]*B[B_row][B_col];
					}
					if(B_col == 0){
						System.out.printf("%d", ans);
					}else{
						System.out.printf(" %d", ans);
					}
				}
				System.out.printf("\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


