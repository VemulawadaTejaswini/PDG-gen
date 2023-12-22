import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		//入居者の情報件数
		int infoNum = scan.nextInt();

		//入居者の情報
		int[][][] infoStay = new int[4][3][10];

		for(int i = 0 ;i < infoNum;i++){
			//情報の入力
			infoStay[scan.nextInt()-1][scan.nextInt()-1][scan.nextInt()-1] += scan.nextInt();
		}

		//棟の数ループ
		for(int building = 0 ;building < 4;building++){
			//階数ループ
			for(int storey = 0 ;storey < 3;storey++){
				//階ごとの部屋の数ループ
				for(int room = 0;room < 10;room++){
					System.out.print(" " + infoStay[building][storey][room]);
				}
				//AOJの制約による改行
				System.out.println("");
			}
			//AOJの制約のよるの条件
			if(building < 3 ){
				System.out.println("####################");
			}
		}
		scan.close();
	}
}

