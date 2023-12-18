import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(true){
			//数字(文字列)を入力
			String scanNum = scan.nextLine();

			//入力された数字が０の時終了
			if(scanNum.equals("0")){
				break;
			}

			//各位の合計
			int sumNum = 0;

			for(int i = 0 ;i < scanNum.length() ;i++){
				//入力された数値の各位をリストに追加
				Character placeNum = scanNum.charAt(i);
				//リストに追加された数値を合計に加算していく
				sumNum += Character.getNumericValue(placeNum);
			}
			System.out.println(sumNum);
		}
		scan.close();
	}
}

