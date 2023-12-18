import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] token = br.readLine().split(" ");
		int row = Integer.parseInt(token[0]);
		int col = Integer.parseInt(token[1]);
		int[][] table = new int[row + 1][col + 1];

		for(int i = 0; i < row; i++){

			token = br.readLine().split(" ");

			for(int j = 0; j < col; j++){
				table[i][j] = Integer.parseInt(token[j]);
			}

		}

		for(int i = 0; i < row; i++){

			int sum = 0;

			for(int j = 0; j < col; j++){
				sum += table[i][j];
			}

			table[i][col] = sum;

		}

		for(int i = 0; i <= col; i++){

			int sum = 0;

			for(int j = 0; j < row; j++){
				sum += table[j][i];
			}

			table[row][i] = sum;

		}

		for(int i = 0; i <= row; i++){
			for(int j = 0; j <= col; j++){

				System.out.print(table[i][j]);

				if(j != col){
					System.out.print(" ");
				}else{
					System.out.print("\n");
				}

			}
		}

	}
}