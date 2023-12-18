import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] A = new int[a][b];
		int[] B = new int[b];
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < b; i++){
			B[i] = sc.nextInt();
		}
		
		for(int i = 0; i < a; i++){
			int num = 0;
			for(int j = 0; j < b; j++){
				num += A[i][j] * B[j];
			}
			System.out.println(num);
		}

	}

}