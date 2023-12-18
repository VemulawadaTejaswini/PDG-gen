import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(true){
			//縦と横のint型の変数
			int intWeight = scan.nextInt();
			int intWidth = scan.nextInt();

			//縦と横の長さがともに０の時ループを抜ける
			if(intWeight == intWidth && intWeight == 0){
				break;
			}

			for(int i = 0 ;i < intWeight;i++){

				for(int j = 0;j < intWidth;j++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
			scan.close();
	}
}

