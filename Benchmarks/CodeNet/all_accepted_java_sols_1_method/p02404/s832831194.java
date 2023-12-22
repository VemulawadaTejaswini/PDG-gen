import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(true){
			//縦と横のint型の変数
			int intHeight = scan.nextInt();
			int intWidth = scan.nextInt();

			int intHeiblank = intHeight - 2;
			int intWidthblank = intWidth - 2;


			//縦と横の長さがともに０の時ループを抜ける
			if(intHeight == intWidth && intHeight == 0){
				break;
			}
			//上辺
			for(int j = 0;j < intWidth;j++){
				System.out.print("#");
			}

			//改行
			System.out.println("");

			for(int i = 0;i < intHeiblank;i++){

				//上段と下段を除いた横の出力
				System.out.print("#");
				for(int j = 0;j < intWidthblank;j++){
					System.out.print(".");
				}
				System.out.print("#");

				//改行
				System.out.println("");
			}
			if(intHeight >= 2){
				//下辺
				for(int j = 0;j < intWidth;j++){
					System.out.print("#");
				}
			}

			//AOZの制約のための空行
			System.out.println("");
			System.out.println("");
		}
			scan.close();
	}
}

