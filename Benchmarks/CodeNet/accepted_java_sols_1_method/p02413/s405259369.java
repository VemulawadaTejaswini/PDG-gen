
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] matrix = new int[r][c];
		for(int i = 0; i < r; i++){
			for(int k = 0; k < c; k++){
				matrix[i][k] = sc.nextInt();
			}
		}
		for(int i = 0; i < r; i++){
			int subtotal = 0;
			for(int k = 0; k < c; k++){
				System.out.print(matrix[i][k] + " ");
				subtotal += matrix[i][k];
			}
			System.out.println(subtotal);
		}
		int total = 0;
		for(int i = 0; i < c; i++){
			int subtotal = 0;
			for(int k = 0; k < r; k++){
				subtotal += matrix[k][i];
			}
			total += subtotal;
			System.out.print(subtotal + " ");
		}
		System.out.println(total);
	}
}

