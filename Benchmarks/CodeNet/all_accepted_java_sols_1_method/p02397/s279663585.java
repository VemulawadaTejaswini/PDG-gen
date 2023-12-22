import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		//スキャナークラスを宣言
		Scanner scan = new Scanner(System.in);

		//inｔ型の変数を
		int intNum1;
		int intNum2;

		while(true){
			//入力した内容を変数に代入
			intNum1 = scan.nextInt();
			intNum2 = scan.nextInt();

			//条件式 数が小さい順に表示される
			//二つの数値がともに０場合は何も出力せずループを抜ける
			if(intNum1 > intNum2){
				System.out.println(intNum2 + " " + intNum1);
			}else if(intNum1 < intNum2){
				System.out.println(intNum1 + " " + intNum2);
			}else if(intNum1 == intNum2 && intNum1 != 0){
				System.out.println(intNum1 + " " + intNum2);
			}else if(intNum1 == 0 && intNum2 == 0){
				break;
			}
		}
		scan.close();
	}
}

