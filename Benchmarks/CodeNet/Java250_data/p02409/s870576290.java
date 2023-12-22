import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int intNum = scan.nextInt();
		int b;
		int f;
		int r;
		int v;
		int[][] intArray1 = new int[3][10];
		int[][] intArray2 = new int[3][10];
		int[][] intArray3 = new int[3][10];
		int[][] intArray4 = new int[3][10];

		for(int i = 0; i < intNum; i++){
			b = scan.nextInt();
			f = scan.nextInt();
			r = scan.nextInt();
			v = scan.nextInt();
			if(b == 1){
				intArray1[f-1][r-1] = intArray1[f-1][r-1] += v;
			}else if(b == 2){
				intArray2[f-1][r-1] = intArray2[f-1][r-1] + v;
			}else if(b == 3){
				intArray3[f-1][r-1] = intArray3[f-1][r-1] + v;
			}else if(b == 4){
				intArray4[f-1][r-1] = intArray4[f-1][r-1] + v;
			}
		}

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 10; j++){
				System.out.print(" " + intArray1[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 10; j++){
				System.out.print(" " + intArray2[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 10; j++){
				System.out.print(" " + intArray3[i][j]);
			}
			System.out.println();
		}
		System.out.println("####################");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 10; j++){
				System.out.print(" " + intArray4[i][j]);
			}
			System.out.println();
		}
		scan.close();
	}
}