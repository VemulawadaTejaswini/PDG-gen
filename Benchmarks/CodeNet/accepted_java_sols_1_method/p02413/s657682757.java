import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		int column = sc.nextInt();
		int row_result = 0;
		int column_result = 0;
		int[][] nums = new int[row + 1][column+ 1];

		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				nums[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < row; i ++) {
			for(int j = 0; j < column; j++) {
				 row_result += nums[i][j];
			}
			 nums[i][column] = row_result;
			 row_result = 0;
		}

		for(int i = 0; i < column; i++) {
			for(int j = 0; j < row; j ++) {
				column_result += nums[j][i];
			}
			nums[row][i] = column_result;
			column_result = 0;
		}

		int total_result = 0;

		for(int i = 0; i < row; i++) {
			total_result += nums[i][column];
		}

		nums[row][column] = total_result;

		 for(int i = 0; i <= row ; i++) {
			 for(int j = 0; j <= column; j++) {
				 if(j != column) {
					 System.out.print(nums[i][j] + " ");
				 }else {
					 System.out.println(nums[i][j]);
				 }
			 }
		 }
	}
}

