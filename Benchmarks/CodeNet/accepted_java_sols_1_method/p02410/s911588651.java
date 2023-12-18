import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] token = br.readLine().split(" ");
		int a_col = Integer.parseInt(token[0]);
		int a_row = Integer.parseInt(token[1]);
		int b_col = a_row;
		int[][] a = new int[a_col][a_row];
		int[] b = new int[b_col];

		for(int i = 0; i < a_col; i++){

			token = br.readLine().split(" ");

			for(int j = 0; j < a_row; j++){
				a[i][j] = Integer.parseInt(token[j]);
			}

		}

		for(int i = 0; i < b_col; i++){
			b[i] = Integer.parseInt(br.readLine());
		}

		for(int i = 0; i < a_col; i++){

			int sum = 0;

			for(int j = 0; j < a_row; j++){
				sum += a[i][j] * b[j];
			}

			System.out.println(sum);

		}

	}
}