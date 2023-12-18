import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int row = scan.nextInt();
		int column = scan.nextInt();
		int[][] spreadNum = new int[row+1][column+1];

		for(int rowI = 0 ;rowI < row ;rowI++){
			for(int columnI = 0 ;columnI < column ;columnI++){
				//行の入力
				spreadNum[rowI][columnI] = scan.nextInt();

				//行の合計
				spreadNum[rowI][column] += spreadNum[rowI][columnI];
				//列の合計
				spreadNum[row][columnI] += spreadNum[rowI][columnI];
				//行列の合計
				spreadNum[row][column] += spreadNum[rowI][columnI];
			}
		}
		for(int rowI = 0 ;rowI < row ;rowI++){
			for(int columnI = 0 ;columnI < column ;columnI++){
				//すべての出力
				System.out.print(spreadNum[rowI][columnI] + " ");
			}
				System.out.println(spreadNum[rowI][column]);
		}
		for(int columnI = 0 ;columnI < column ;columnI++){
			System.out.print(spreadNum[row][columnI] + " ");
		}
		System.out.println(spreadNum[row][column]);
		scan.close();
	}

}

