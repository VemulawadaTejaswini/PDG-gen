import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
			String[] array = input.split(" ");
			int r = Integer.parseInt(array[0]);
			int c = Integer.parseInt(array[1]);
			
			int[][] cell = new int[r][c];
			for (int i = 0; i < r; i++) {
				input = reader.readLine();
				array = input.split(" ");
				for (int j = 0; j < c; j++) {
					cell[i][j] = Integer.parseInt(array[j]);
				}
			}
			
			int sumRow = 0;
			int sumCol[] = new int[c + 1];
			int sum = 0;
			for (int k = 0; k < r; k++) {
				for (int l = 0; l < c; l++) {
					System.out.print(cell[k][l] + " "); 
					sumRow += cell[k][l];
					sumCol[l] += cell[k][l];
				}
				System.out.println(sumRow);
				sum += sumRow;
				sumRow = 0;
			}
			
			for (int m = 0; m < c; m++) {
				System.out.print(sumCol[m] + " ");
			}
			System.out.println(sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}