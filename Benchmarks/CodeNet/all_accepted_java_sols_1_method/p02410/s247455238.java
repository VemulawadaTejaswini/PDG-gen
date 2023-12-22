
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int intN = sc.nextInt();
		int intM = sc.nextInt();

		int[][] arrayA = new int[intN][intM];
		int[] arrayB = new int[intM];
		int[] arrayAns = new int[intN];

		for(int i = 0; i < intN; i++) {
			for(int j = 0; j < intM; j++) {
				arrayA[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < intM; i++) {
			arrayB[i] = sc.nextInt();
		}


		int x = 0;
		int y = 0;
		for(int i = 0; i < intN; i++) {
			for(int j = 0; j < intM; j++) {
				y = arrayA[i][j] * arrayB[j];
				x = x + y;
			}

			arrayAns[i] = x;
			System.out.println(arrayAns[i]);
			y = 0;
			x = 0;
		}
/*

		for(int i = 0; i < intN; i++) {
			for(int j = 0; j < intM; j++) {
				System.out.print("arrayA["+i+"]["+j+"] = "+arrayA[i][j]+" ");
			}
			System.out.println("");
		}

		for(int i = 0; i < intM; i++) {
			System.out.println("arrayB["+i+"] = "+arrayB[i]);
		}
*/
	}
}