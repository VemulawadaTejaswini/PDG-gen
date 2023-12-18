import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row_cout	=	sc.nextInt();
		int column_cout	=	sc.nextInt();

		int[][]	matrix			=	new int[row_cout][column_cout];
		int[]	vector			=	new int[column_cout];
		int[]	multiplication	=	new int[row_cout];

		for(int row = 0; row < row_cout; row++) {
			for(int column = 0; column < column_cout; column++) {
				matrix[row][column] = sc.nextInt();
			}
		}

		for(int column = 0; column < column_cout; column++) {
			vector[column] = sc.nextInt();
		}
		sc.close();

		for(int row = 0; row < row_cout; row++) {
			for(int column = 0; column < column_cout; column++) {
				multiplication[row] = multiplication[row] + (matrix[row][column] * vector[column]);
			}
		}

		for(int row = 0; row < row_cout; row++) {
			System.out.println(multiplication[row]);
		}
	}
}
